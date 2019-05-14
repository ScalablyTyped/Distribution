package typings
package codemirrorLib.codemirrorMod

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
  var completionTip: js.UndefOr[
    js.Function1[
      /* data */ ternLib.libTernMod.CompletionsQueryResult, 
      java.lang.String | stdLib.HTMLElement | scala.Null
    ]
  ] = js.undefined
  /** An array of JSON definition data structures. */
  var defs: js.UndefOr[js.Array[ternLib.libTernMod.Def]] = js.undefined
  /**
    * This function will be applied
    * to documents before passing them on to Tern.
    */
  var fileFilter: js.UndefOr[
    js.Function3[
      /* value */ java.lang.String, 
      /* docName */ java.lang.String, 
      /* doc */ Doc, 
      java.lang.String
    ]
  ] = js.undefined
  /**
    * Can be used to access files in
    * the project that haven't been loaded yet. Simply do callback(null) to
    * indicate that a file is not available.
    */
  var getFile: js.UndefOr[
    js.Function2[
      /* name */ java.lang.String, 
      /* callback */ js.Function1[/* doc */ Doc | scala.Null, _], 
      _
    ]
  ] = js.undefined
  /** An object mapping plugin names to configuration options. */
  var plugins: /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any
  ] = js.undefined
  /** This function will be applied to the Tern responses before treating them */
  var responseFilter: js.UndefOr[
    js.Function5[
      /* doc */ Doc, 
      /* query */ ternLib.libTernMod.Query, 
      /* request */ ternLib.libTernMod.Document, 
      /* error */ js.UndefOr[stdLib.Error], 
      /* data */ js.UndefOr[
        /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[tern.tern/lib/tern.Query['type']]['result'] */ js.Any
      ], 
      _
    ]
  ] = js.undefined
  /** Can be used to override the way errors are displayed. */
  var showError: js.UndefOr[js.Function2[/* editor */ Editor, /* message */ stdLib.Error, _]] = js.undefined
  /** This function should, when providing a multi-file view, switch the view or focus to the named file. */
  var switchToDoc: js.UndefOr[js.Function2[/* name */ java.lang.String, /* doc */ Doc, _]] = js.undefined
  /** Like completionTip, but for the tooltips shown for type queries. */
  var typeTip: js.UndefOr[
    js.Function1[
      /* data */ ternLib.libTernMod.TypeQueryResult, 
      java.lang.String | stdLib.HTMLElement | scala.Null
    ]
  ] = js.undefined
  /**
    * Set to true to enable web worker mode. You'll probably
    * want to feature detect the actual value you use here, for example
    * !!window.Worker.
    */
  var useWorker: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of paths pointing (relative to workerScript)
    * to the Acorn and Tern libraries and any Tern plugins you want to
    * load. Or, if you minified those into a single script and included
    * them in the workerScript, simply leave this undefined.
    */
  var workerDeps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The main script of the worker. Point this to wherever you are hosting worker.js from this directory. */
  var workerScript: js.UndefOr[java.lang.String] = js.undefined
}

object TernOptions {
  @scala.inline
  def apply(
    completionTip: /* data */ ternLib.libTernMod.CompletionsQueryResult => java.lang.String | stdLib.HTMLElement | scala.Null = null,
    defs: js.Array[ternLib.libTernMod.Def] = null,
    fileFilter: (/* value */ java.lang.String, /* docName */ java.lang.String, /* doc */ Doc) => java.lang.String = null,
    getFile: (/* name */ java.lang.String, /* callback */ js.Function1[/* doc */ Doc | scala.Null, _]) => _ = null,
    plugins: /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any = null,
    responseFilter: (/* doc */ Doc, /* query */ ternLib.libTernMod.Query, /* request */ ternLib.libTernMod.Document, /* error */ js.UndefOr[stdLib.Error], /* data */ js.UndefOr[
      /* import warning: ImportType.apply Failed type conversion: tern.tern/lib/tern.QueryRegistry[tern.tern/lib/tern.Query['type']]['result'] */ js.Any
    ]) => _ = null,
    showError: (/* editor */ Editor, /* message */ stdLib.Error) => _ = null,
    switchToDoc: (/* name */ java.lang.String, /* doc */ Doc) => _ = null,
    typeTip: /* data */ ternLib.libTernMod.TypeQueryResult => java.lang.String | stdLib.HTMLElement | scala.Null = null,
    useWorker: js.UndefOr[scala.Boolean] = js.undefined,
    workerDeps: js.Array[java.lang.String] = null,
    workerScript: java.lang.String = null
  ): TernOptions = {
    val __obj = js.Dynamic.literal()
    if (completionTip != null) __obj.updateDynamic("completionTip")(js.Any.fromFunction1(completionTip))
    if (defs != null) __obj.updateDynamic("defs")(defs)
    if (fileFilter != null) __obj.updateDynamic("fileFilter")(js.Any.fromFunction3(fileFilter))
    if (getFile != null) __obj.updateDynamic("getFile")(js.Any.fromFunction2(getFile))
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (responseFilter != null) __obj.updateDynamic("responseFilter")(js.Any.fromFunction5(responseFilter))
    if (showError != null) __obj.updateDynamic("showError")(js.Any.fromFunction2(showError))
    if (switchToDoc != null) __obj.updateDynamic("switchToDoc")(js.Any.fromFunction2(switchToDoc))
    if (typeTip != null) __obj.updateDynamic("typeTip")(js.Any.fromFunction1(typeTip))
    if (!js.isUndefined(useWorker)) __obj.updateDynamic("useWorker")(useWorker)
    if (workerDeps != null) __obj.updateDynamic("workerDeps")(workerDeps)
    if (workerScript != null) __obj.updateDynamic("workerScript")(workerScript)
    __obj.asInstanceOf[TernOptions]
  }
}

