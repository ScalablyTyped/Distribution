package typings.codemirror.mod

import typings.std.Error
import typings.std.HTMLElement
import typings.tern.ternMod.CompletionsQueryResult
import typings.tern.ternMod.Def
import typings.tern.ternMod.DefinitionQueryResult
import typings.tern.ternMod.Document
import typings.tern.ternMod.DocumentationQueryResult
import typings.tern.ternMod.FilesQueryResult
import typings.tern.ternMod.PropertiesQueryResult
import typings.tern.ternMod.Query
import typings.tern.ternMod.RefsQueryResult
import typings.tern.ternMod.RenameQueryResult
import typings.tern.ternMod.TypeQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TernOptions extends js.Object {
  /**
    * Customize the content in tooltips for completions.
    * Is passed a single argument — the completion's data as returned by
    * Tern — and may return a string, DOM node, or null to indicate that
    * no tip should be shown. By default the docstring is shown.
    */
  var completionTip: js.UndefOr[js.Function1[/* data */ CompletionsQueryResult, String | HTMLElement | Null]] = js.undefined
  /** An array of JSON definition data structures. */
  var defs: js.UndefOr[js.Array[Def]] = js.undefined
  /**
    * This function will be applied
    * to documents before passing them on to Tern.
    */
  var fileFilter: js.UndefOr[js.Function3[/* value */ String, /* docName */ String, /* doc */ Doc, String]] = js.undefined
  /**
    * Can be used to access files in
    * the project that haven't been loaded yet. Simply do callback(null) to
    * indicate that a file is not available.
    */
  var getFile: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* doc */ Doc | Null, _], _]
  ] = js.undefined
  /** An object mapping plugin names to configuration options. */
  var plugins: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any
  ] = js.undefined
  /** This function will be applied to the Tern responses before treating them */
  var responseFilter: js.UndefOr[
    js.Function5[
      /* doc */ Doc, 
      /* query */ Query, 
      /* request */ Document, 
      /* error */ js.UndefOr[Error], 
      /* data */ js.UndefOr[
        RefsQueryResult | DefinitionQueryResult | DocumentationQueryResult | FilesQueryResult | PropertiesQueryResult | CompletionsQueryResult | TypeQueryResult | RenameQueryResult
      ], 
      _
    ]
  ] = js.undefined
  /** Can be used to override the way errors are displayed. */
  var showError: js.UndefOr[js.Function2[/* editor */ Editor, /* message */ Error, _]] = js.undefined
  /** This function should, when providing a multi-file view, switch the view or focus to the named file. */
  var switchToDoc: js.UndefOr[js.Function2[/* name */ String, /* doc */ Doc, _]] = js.undefined
  /** Like completionTip, but for the tooltips shown for type queries. */
  var typeTip: js.UndefOr[js.Function1[/* data */ TypeQueryResult, String | HTMLElement | Null]] = js.undefined
  /**
    * Set to true to enable web worker mode. You'll probably
    * want to feature detect the actual value you use here, for example
    * !!window.Worker.
    */
  var useWorker: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of paths pointing (relative to workerScript)
    * to the Acorn and Tern libraries and any Tern plugins you want to
    * load. Or, if you minified those into a single script and included
    * them in the workerScript, simply leave this undefined.
    */
  var workerDeps: js.UndefOr[js.Array[String]] = js.undefined
  /** The main script of the worker. Point this to wherever you are hosting worker.js from this directory. */
  var workerScript: js.UndefOr[String] = js.undefined
}

object TernOptions {
  @scala.inline
  def apply(
    completionTip: /* data */ CompletionsQueryResult => String | HTMLElement | Null = null,
    defs: js.Array[Def] = null,
    fileFilter: (/* value */ String, /* docName */ String, /* doc */ Doc) => String = null,
    getFile: (/* name */ String, /* callback */ js.Function1[/* doc */ Doc | Null, _]) => _ = null,
    plugins: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any = null,
    responseFilter: (/* doc */ Doc, /* query */ Query, /* request */ Document, /* error */ js.UndefOr[Error], /* data */ js.UndefOr[
      RefsQueryResult | DefinitionQueryResult | DocumentationQueryResult | FilesQueryResult | PropertiesQueryResult | CompletionsQueryResult | TypeQueryResult | RenameQueryResult
    ]) => _ = null,
    showError: (/* editor */ Editor, /* message */ Error) => _ = null,
    switchToDoc: (/* name */ String, /* doc */ Doc) => _ = null,
    typeTip: /* data */ TypeQueryResult => String | HTMLElement | Null = null,
    useWorker: js.UndefOr[Boolean] = js.undefined,
    workerDeps: js.Array[String] = null,
    workerScript: String = null
  ): TernOptions = {
    val __obj = js.Dynamic.literal()
    if (completionTip != null) __obj.updateDynamic("completionTip")(js.Any.fromFunction1(completionTip))
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(js.Any.fromFunction3(fileFilter))
    if (getFile != null) __obj.updateDynamic("getFile")(js.Any.fromFunction2(getFile))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (responseFilter != null) __obj.updateDynamic("responseFilter")(js.Any.fromFunction5(responseFilter))
    if (showError != null) __obj.updateDynamic("showError")(js.Any.fromFunction2(showError))
    if (switchToDoc != null) __obj.updateDynamic("switchToDoc")(js.Any.fromFunction2(switchToDoc))
    if (typeTip != null) __obj.updateDynamic("typeTip")(js.Any.fromFunction1(typeTip))
    if (!js.isUndefined(useWorker)) __obj.updateDynamic("useWorker")(useWorker.get.asInstanceOf[js.Any])
    if (workerDeps != null) __obj.updateDynamic("workerDeps")(workerDeps.asInstanceOf[js.Any])
    if (workerScript != null) __obj.updateDynamic("workerScript")(workerScript.asInstanceOf[js.Any])
    __obj.asInstanceOf[TernOptions]
  }
}

