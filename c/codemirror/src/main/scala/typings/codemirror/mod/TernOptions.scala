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

@js.native
trait TernOptions extends js.Object {
  /**
    * Customize the content in tooltips for completions.
    * Is passed a single argument — the completion's data as returned by
    * Tern — and may return a string, DOM node, or null to indicate that
    * no tip should be shown. By default the docstring is shown.
    */
  var completionTip: js.UndefOr[js.Function1[/* data */ CompletionsQueryResult, String | HTMLElement | Null]] = js.native
  /** An array of JSON definition data structures. */
  var defs: js.UndefOr[js.Array[Def]] = js.native
  /**
    * This function will be applied
    * to documents before passing them on to Tern.
    */
  var fileFilter: js.UndefOr[js.Function3[/* value */ String, /* docName */ String, /* doc */ Doc, String]] = js.native
  /**
    * Can be used to access files in
    * the project that haven't been loaded yet. Simply do callback(null) to
    * indicate that a file is not available.
    */
  var getFile: js.UndefOr[
    js.Function2[/* name */ String, /* callback */ js.Function1[/* doc */ Doc | Null, _], _]
  ] = js.native
  /** An object mapping plugin names to configuration options. */
  var plugins: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any
  ] = js.native
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
  ] = js.native
  /** Can be used to override the way errors are displayed. */
  var showError: js.UndefOr[js.Function2[/* editor */ Editor, /* message */ Error, _]] = js.native
  /** This function should, when providing a multi-file view, switch the view or focus to the named file. */
  var switchToDoc: js.UndefOr[js.Function2[/* name */ String, /* doc */ Doc, _]] = js.native
  /** Like completionTip, but for the tooltips shown for type queries. */
  var typeTip: js.UndefOr[js.Function1[/* data */ TypeQueryResult, String | HTMLElement | Null]] = js.native
  /**
    * Set to true to enable web worker mode. You'll probably
    * want to feature detect the actual value you use here, for example
    * !!window.Worker.
    */
  var useWorker: js.UndefOr[Boolean] = js.native
  /**
    * An array of paths pointing (relative to workerScript)
    * to the Acorn and Tern libraries and any Tern plugins you want to
    * load. Or, if you minified those into a single script and included
    * them in the workerScript, simply leave this undefined.
    */
  var workerDeps: js.UndefOr[js.Array[String]] = js.native
  /** The main script of the worker. Point this to wherever you are hosting worker.js from this directory. */
  var workerScript: js.UndefOr[String] = js.native
}

object TernOptions {
  @scala.inline
  def apply(): TernOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TernOptions]
  }
  @scala.inline
  implicit class TernOptionsOps[Self <: TernOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompletionTip(value: /* data */ CompletionsQueryResult => String | HTMLElement | Null): Self = this.set("completionTip", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCompletionTip: Self = this.set("completionTip", js.undefined)
    @scala.inline
    def setDefsVarargs(value: Def*): Self = this.set("defs", js.Array(value :_*))
    @scala.inline
    def setDefs(value: js.Array[Def]): Self = this.set("defs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefs: Self = this.set("defs", js.undefined)
    @scala.inline
    def setFileFilter(value: (/* value */ String, /* docName */ String, /* doc */ Doc) => String): Self = this.set("fileFilter", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFileFilter: Self = this.set("fileFilter", js.undefined)
    @scala.inline
    def setGetFile(value: (/* name */ String, /* callback */ js.Function1[/* doc */ Doc | Null, _]) => _): Self = this.set("getFile", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetFile: Self = this.set("getFile", js.undefined)
    @scala.inline
    def setPlugins(
      value: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.ConstructorOptions['plugins'] */ js.Any
    ): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setResponseFilter(
      value: (/* doc */ Doc, /* query */ Query, /* request */ Document, /* error */ js.UndefOr[Error], /* data */ js.UndefOr[
          RefsQueryResult | DefinitionQueryResult | DocumentationQueryResult | FilesQueryResult | PropertiesQueryResult | CompletionsQueryResult | TypeQueryResult | RenameQueryResult
        ]) => _
    ): Self = this.set("responseFilter", js.Any.fromFunction5(value))
    @scala.inline
    def deleteResponseFilter: Self = this.set("responseFilter", js.undefined)
    @scala.inline
    def setShowError(value: (/* editor */ Editor, /* message */ Error) => _): Self = this.set("showError", js.Any.fromFunction2(value))
    @scala.inline
    def deleteShowError: Self = this.set("showError", js.undefined)
    @scala.inline
    def setSwitchToDoc(value: (/* name */ String, /* doc */ Doc) => _): Self = this.set("switchToDoc", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSwitchToDoc: Self = this.set("switchToDoc", js.undefined)
    @scala.inline
    def setTypeTip(value: /* data */ TypeQueryResult => String | HTMLElement | Null): Self = this.set("typeTip", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTypeTip: Self = this.set("typeTip", js.undefined)
    @scala.inline
    def setUseWorker(value: Boolean): Self = this.set("useWorker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseWorker: Self = this.set("useWorker", js.undefined)
    @scala.inline
    def setWorkerDepsVarargs(value: String*): Self = this.set("workerDeps", js.Array(value :_*))
    @scala.inline
    def setWorkerDeps(value: js.Array[String]): Self = this.set("workerDeps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerDeps: Self = this.set("workerDeps", js.undefined)
    @scala.inline
    def setWorkerScript(value: String): Self = this.set("workerScript", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkerScript: Self = this.set("workerScript", js.undefined)
  }
  
}

