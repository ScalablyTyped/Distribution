package typings.azdata.mod.nb

import org.scalablytyped.runtime.StringDictionary
import typings.azdata.mod.nb.^
import typings.vscode.Thenable
import typings.vscode.mod.Disposable
import typings.vscode.mod.Event
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def activeNotebookEditor: js.UndefOr[NotebookEditor] = ^.asInstanceOf[js.Dynamic].selectDynamic("activeNotebookEditor").asInstanceOf[js.UndefOr[NotebookEditor]]
inline def activeNotebookEditor_=(x: js.UndefOr[NotebookEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeNotebookEditor")(x.asInstanceOf[js.Any])

inline def notebookDocuments: js.Array[NotebookDocument] = ^.asInstanceOf[js.Dynamic].selectDynamic("notebookDocuments").asInstanceOf[js.Array[NotebookDocument]]
inline def notebookDocuments_=(x: js.Array[NotebookDocument]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notebookDocuments")(x.asInstanceOf[js.Any])

inline def onDidChangeActiveNotebookEditor: Event[NotebookEditor] = ^.asInstanceOf[js.Dynamic].selectDynamic("onDidChangeActiveNotebookEditor").asInstanceOf[Event[NotebookEditor]]

inline def onDidChangeNotebookCell: Event[NotebookCellChangeEvent] = ^.asInstanceOf[js.Dynamic].selectDynamic("onDidChangeNotebookCell").asInstanceOf[Event[NotebookCellChangeEvent]]

inline def onDidOpenNotebookDocument: Event[NotebookDocument] = ^.asInstanceOf[js.Dynamic].selectDynamic("onDidOpenNotebookDocument").asInstanceOf[Event[NotebookDocument]]

inline def registerExecuteProvider(provider: NotebookExecuteProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerExecuteProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]

inline def registerNavigationProvider(provider: NavigationProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]

inline def registerSerializationProvider(provider: NotebookSerializationProvider): Disposable = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSerializationProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[Disposable]

inline def showNotebookDocument(uri: Uri): Thenable[NotebookEditor] = ^.asInstanceOf[js.Dynamic].applyDynamic("showNotebookDocument")(uri.asInstanceOf[js.Any]).asInstanceOf[Thenable[NotebookEditor]]
inline def showNotebookDocument(uri: Uri, showOptions: NotebookShowOptions): Thenable[NotebookEditor] = (^.asInstanceOf[js.Dynamic].applyDynamic("showNotebookDocument")(uri.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any])).asInstanceOf[Thenable[NotebookEditor]]

inline def visibleNotebookEditors: js.Array[NotebookEditor] = ^.asInstanceOf[js.Dynamic].selectDynamic("visibleNotebookEditors").asInstanceOf[js.Array[NotebookEditor]]
inline def visibleNotebookEditors_=(x: js.Array[NotebookEditor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visibleNotebookEditors")(x.asInstanceOf[js.Any])

type DisplayResultData = StringDictionary[Any]

type MultilineString = String | js.Array[String]
