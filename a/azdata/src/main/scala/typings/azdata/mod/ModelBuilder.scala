package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelBuilder extends StObject {
  
  def button(): ComponentBuilder[ButtonComponent]
  
  /**
    * @deprecated please use radioCardGroup component.
    */
  def card(): ComponentBuilder[CardComponent]
  
  def checkBox(): ComponentBuilder[CheckBoxComponent]
  
  def dashboardWebview(webviewId: String): ComponentBuilder[DashboardWebviewComponent]
  
  def dashboardWidget(widgetId: String): ComponentBuilder[DashboardWidgetComponent]
  
  def declarativeTable(): ComponentBuilder[DeclarativeTableComponent]
  
  def diffeditor(): ComponentBuilder[DiffEditorComponent]
  
  def divContainer(): DivBuilder
  
  def dom(): ComponentBuilder[DomComponent]
  
  def dropDown(): ComponentBuilder[DropDownComponent]
  
  def editor(): ComponentBuilder[EditorComponent]
  
  def fileBrowserTree(): ComponentBuilder[FileBrowserTreeComponent]
  
  def flexContainer(): FlexBuilder
  
  def formContainer(): FormBuilder
  
  def groupContainer(): GroupBuilder
  
  def hyperlink(): ComponentBuilder[HyperlinkComponent]
  
  def image(): ComponentBuilder[ImageComponent]
  
  def inputBox(): ComponentBuilder[InputBoxComponent]
  
  def listBox(): ComponentBuilder[ListBoxComponent]
  
  def loadingComponent(): LoadingComponentBuilder
  
  def navContainer(): ContainerBuilder[NavContainer, js.Any, js.Any]
  
  def radioButton(): ComponentBuilder[RadioButtonComponent]
  
  def splitViewContainer(): SplitViewBuilder
  
  def table(): ComponentBuilder[TableComponent]
  
  def text(): ComponentBuilder[TextComponent]
  
  def toolbarContainer(): ToolbarBuilder
  
  def tree[T](): ComponentBuilder[TreeComponent[T]]
  
  def webView(): ComponentBuilder[WebViewComponent]
}
object ModelBuilder {
  
  inline def apply(
    button: () => ComponentBuilder[ButtonComponent],
    card: () => ComponentBuilder[CardComponent],
    checkBox: () => ComponentBuilder[CheckBoxComponent],
    dashboardWebview: String => ComponentBuilder[DashboardWebviewComponent],
    dashboardWidget: String => ComponentBuilder[DashboardWidgetComponent],
    declarativeTable: () => ComponentBuilder[DeclarativeTableComponent],
    diffeditor: () => ComponentBuilder[DiffEditorComponent],
    divContainer: () => DivBuilder,
    dom: () => ComponentBuilder[DomComponent],
    dropDown: () => ComponentBuilder[DropDownComponent],
    editor: () => ComponentBuilder[EditorComponent],
    fileBrowserTree: () => ComponentBuilder[FileBrowserTreeComponent],
    flexContainer: () => FlexBuilder,
    formContainer: () => FormBuilder,
    groupContainer: () => GroupBuilder,
    hyperlink: () => ComponentBuilder[HyperlinkComponent],
    image: () => ComponentBuilder[ImageComponent],
    inputBox: () => ComponentBuilder[InputBoxComponent],
    listBox: () => ComponentBuilder[ListBoxComponent],
    loadingComponent: () => LoadingComponentBuilder,
    navContainer: () => ContainerBuilder[NavContainer, js.Any, js.Any],
    radioButton: () => ComponentBuilder[RadioButtonComponent],
    splitViewContainer: () => SplitViewBuilder,
    table: () => ComponentBuilder[TableComponent],
    text: () => ComponentBuilder[TextComponent],
    toolbarContainer: () => ToolbarBuilder,
    tree: () => ComponentBuilder[TreeComponent[js.Any]],
    webView: () => ComponentBuilder[WebViewComponent]
  ): ModelBuilder = {
    val __obj = js.Dynamic.literal(button = js.Any.fromFunction0(button), card = js.Any.fromFunction0(card), checkBox = js.Any.fromFunction0(checkBox), dashboardWebview = js.Any.fromFunction1(dashboardWebview), dashboardWidget = js.Any.fromFunction1(dashboardWidget), declarativeTable = js.Any.fromFunction0(declarativeTable), diffeditor = js.Any.fromFunction0(diffeditor), divContainer = js.Any.fromFunction0(divContainer), dom = js.Any.fromFunction0(dom), dropDown = js.Any.fromFunction0(dropDown), editor = js.Any.fromFunction0(editor), fileBrowserTree = js.Any.fromFunction0(fileBrowserTree), flexContainer = js.Any.fromFunction0(flexContainer), formContainer = js.Any.fromFunction0(formContainer), groupContainer = js.Any.fromFunction0(groupContainer), hyperlink = js.Any.fromFunction0(hyperlink), image = js.Any.fromFunction0(image), inputBox = js.Any.fromFunction0(inputBox), listBox = js.Any.fromFunction0(listBox), loadingComponent = js.Any.fromFunction0(loadingComponent), navContainer = js.Any.fromFunction0(navContainer), radioButton = js.Any.fromFunction0(radioButton), splitViewContainer = js.Any.fromFunction0(splitViewContainer), table = js.Any.fromFunction0(table), text = js.Any.fromFunction0(text), toolbarContainer = js.Any.fromFunction0(toolbarContainer), tree = js.Any.fromFunction0(tree), webView = js.Any.fromFunction0(webView))
    __obj.asInstanceOf[ModelBuilder]
  }
  
  extension [Self <: ModelBuilder](x: Self) {
    
    inline def setButton(value: () => ComponentBuilder[ButtonComponent]): Self = StObject.set(x, "button", js.Any.fromFunction0(value))
    
    inline def setCard(value: () => ComponentBuilder[CardComponent]): Self = StObject.set(x, "card", js.Any.fromFunction0(value))
    
    inline def setCheckBox(value: () => ComponentBuilder[CheckBoxComponent]): Self = StObject.set(x, "checkBox", js.Any.fromFunction0(value))
    
    inline def setDashboardWebview(value: String => ComponentBuilder[DashboardWebviewComponent]): Self = StObject.set(x, "dashboardWebview", js.Any.fromFunction1(value))
    
    inline def setDashboardWidget(value: String => ComponentBuilder[DashboardWidgetComponent]): Self = StObject.set(x, "dashboardWidget", js.Any.fromFunction1(value))
    
    inline def setDeclarativeTable(value: () => ComponentBuilder[DeclarativeTableComponent]): Self = StObject.set(x, "declarativeTable", js.Any.fromFunction0(value))
    
    inline def setDiffeditor(value: () => ComponentBuilder[DiffEditorComponent]): Self = StObject.set(x, "diffeditor", js.Any.fromFunction0(value))
    
    inline def setDivContainer(value: () => DivBuilder): Self = StObject.set(x, "divContainer", js.Any.fromFunction0(value))
    
    inline def setDom(value: () => ComponentBuilder[DomComponent]): Self = StObject.set(x, "dom", js.Any.fromFunction0(value))
    
    inline def setDropDown(value: () => ComponentBuilder[DropDownComponent]): Self = StObject.set(x, "dropDown", js.Any.fromFunction0(value))
    
    inline def setEditor(value: () => ComponentBuilder[EditorComponent]): Self = StObject.set(x, "editor", js.Any.fromFunction0(value))
    
    inline def setFileBrowserTree(value: () => ComponentBuilder[FileBrowserTreeComponent]): Self = StObject.set(x, "fileBrowserTree", js.Any.fromFunction0(value))
    
    inline def setFlexContainer(value: () => FlexBuilder): Self = StObject.set(x, "flexContainer", js.Any.fromFunction0(value))
    
    inline def setFormContainer(value: () => FormBuilder): Self = StObject.set(x, "formContainer", js.Any.fromFunction0(value))
    
    inline def setGroupContainer(value: () => GroupBuilder): Self = StObject.set(x, "groupContainer", js.Any.fromFunction0(value))
    
    inline def setHyperlink(value: () => ComponentBuilder[HyperlinkComponent]): Self = StObject.set(x, "hyperlink", js.Any.fromFunction0(value))
    
    inline def setImage(value: () => ComponentBuilder[ImageComponent]): Self = StObject.set(x, "image", js.Any.fromFunction0(value))
    
    inline def setInputBox(value: () => ComponentBuilder[InputBoxComponent]): Self = StObject.set(x, "inputBox", js.Any.fromFunction0(value))
    
    inline def setListBox(value: () => ComponentBuilder[ListBoxComponent]): Self = StObject.set(x, "listBox", js.Any.fromFunction0(value))
    
    inline def setLoadingComponent(value: () => LoadingComponentBuilder): Self = StObject.set(x, "loadingComponent", js.Any.fromFunction0(value))
    
    inline def setNavContainer(value: () => ContainerBuilder[NavContainer, js.Any, js.Any]): Self = StObject.set(x, "navContainer", js.Any.fromFunction0(value))
    
    inline def setRadioButton(value: () => ComponentBuilder[RadioButtonComponent]): Self = StObject.set(x, "radioButton", js.Any.fromFunction0(value))
    
    inline def setSplitViewContainer(value: () => SplitViewBuilder): Self = StObject.set(x, "splitViewContainer", js.Any.fromFunction0(value))
    
    inline def setTable(value: () => ComponentBuilder[TableComponent]): Self = StObject.set(x, "table", js.Any.fromFunction0(value))
    
    inline def setText(value: () => ComponentBuilder[TextComponent]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    inline def setToolbarContainer(value: () => ToolbarBuilder): Self = StObject.set(x, "toolbarContainer", js.Any.fromFunction0(value))
    
    inline def setTree(value: () => ComponentBuilder[TreeComponent[js.Any]]): Self = StObject.set(x, "tree", js.Any.fromFunction0(value))
    
    inline def setWebView(value: () => ComponentBuilder[WebViewComponent]): Self = StObject.set(x, "webView", js.Any.fromFunction0(value))
  }
}
