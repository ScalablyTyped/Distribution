package typings.azdata.mod.nb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def activeNotebookEditor: js.UndefOr[typings.azdata.mod.nb.NotebookEditor] = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].selectDynamic("activeNotebookEditor").asInstanceOf[js.UndefOr[typings.azdata.mod.nb.NotebookEditor]]
@scala.inline
def activeNotebookEditor_=(x: js.UndefOr[typings.azdata.mod.nb.NotebookEditor]): scala.Unit = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].updateDynamic("activeNotebookEditor")(x.asInstanceOf[js.Any])

@scala.inline
def notebookDocuments: js.Array[typings.azdata.mod.nb.NotebookDocument] = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].selectDynamic("notebookDocuments").asInstanceOf[js.Array[typings.azdata.mod.nb.NotebookDocument]]
@scala.inline
def notebookDocuments_=(x: js.Array[typings.azdata.mod.nb.NotebookDocument]): scala.Unit = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].updateDynamic("notebookDocuments")(x.asInstanceOf[js.Any])

@scala.inline
def onDidChangeNotebookCell: typings.vscode.mod.Event[typings.azdata.mod.nb.NotebookCellChangeEvent] = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].selectDynamic("onDidChangeNotebookCell").asInstanceOf[typings.vscode.mod.Event[typings.azdata.mod.nb.NotebookCellChangeEvent]]

@scala.inline
def onDidOpenNotebookDocument: typings.vscode.mod.Event[typings.azdata.mod.nb.NotebookDocument] = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].selectDynamic("onDidOpenNotebookDocument").asInstanceOf[typings.vscode.mod.Event[typings.azdata.mod.nb.NotebookDocument]]

@scala.inline
def registerNavigationProvider(provider: typings.azdata.mod.nb.NavigationProvider): typings.vscode.mod.Disposable = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].applyDynamic("registerNavigationProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.Disposable]

@scala.inline
def registerNotebookProvider(provider: typings.azdata.mod.nb.NotebookProvider): typings.vscode.mod.Disposable = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].applyDynamic("registerNotebookProvider")(provider.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.mod.Disposable]

@scala.inline
def showNotebookDocument(uri: typings.vscode.mod.Uri): typings.vscode.Thenable[typings.azdata.mod.nb.NotebookEditor] = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].applyDynamic("showNotebookDocument")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.vscode.Thenable[typings.azdata.mod.nb.NotebookEditor]]
@scala.inline
def showNotebookDocument(uri: typings.vscode.mod.Uri, showOptions: typings.azdata.mod.nb.NotebookShowOptions): typings.vscode.Thenable[typings.azdata.mod.nb.NotebookEditor] = (typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].applyDynamic("showNotebookDocument")(uri.asInstanceOf[js.Any], showOptions.asInstanceOf[js.Any])).asInstanceOf[typings.vscode.Thenable[typings.azdata.mod.nb.NotebookEditor]]

@scala.inline
def visibleNotebookEditors: js.Array[typings.azdata.mod.nb.NotebookEditor] = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].selectDynamic("visibleNotebookEditors").asInstanceOf[js.Array[typings.azdata.mod.nb.NotebookEditor]]
@scala.inline
def visibleNotebookEditors_=(x: js.Array[typings.azdata.mod.nb.NotebookEditor]): scala.Unit = typings.azdata.mod.nb.^.asInstanceOf[js.Dynamic].updateDynamic("visibleNotebookEditors")(x.asInstanceOf[js.Any])

type MultilineString = java.lang.String | js.Array[java.lang.String]
