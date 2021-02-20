package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelBuilder extends StObject {
  
  def button(): ComponentBuilder[ButtonComponent] = js.native
  
  /**
    * @deprecated please use radioCardGroup component.
    */
  def card(): ComponentBuilder[CardComponent] = js.native
  
  def checkBox(): ComponentBuilder[CheckBoxComponent] = js.native
  
  def dashboardWebview(webviewId: String): ComponentBuilder[DashboardWebviewComponent] = js.native
  
  def dashboardWidget(widgetId: String): ComponentBuilder[DashboardWidgetComponent] = js.native
  
  def declarativeTable(): ComponentBuilder[DeclarativeTableComponent] = js.native
  
  def diffeditor(): ComponentBuilder[DiffEditorComponent] = js.native
  
  def divContainer(): DivBuilder = js.native
  
  def dom(): ComponentBuilder[DomComponent] = js.native
  
  def dropDown(): ComponentBuilder[DropDownComponent] = js.native
  
  def editor(): ComponentBuilder[EditorComponent] = js.native
  
  def fileBrowserTree(): ComponentBuilder[FileBrowserTreeComponent] = js.native
  
  def flexContainer(): FlexBuilder = js.native
  
  def formContainer(): FormBuilder = js.native
  
  def groupContainer(): GroupBuilder = js.native
  
  def hyperlink(): ComponentBuilder[HyperlinkComponent] = js.native
  
  def image(): ComponentBuilder[ImageComponent] = js.native
  
  def inputBox(): ComponentBuilder[InputBoxComponent] = js.native
  
  def listBox(): ComponentBuilder[ListBoxComponent] = js.native
  
  def loadingComponent(): LoadingComponentBuilder = js.native
  
  def navContainer(): ContainerBuilder[NavContainer, _, _] = js.native
  
  def radioButton(): ComponentBuilder[RadioButtonComponent] = js.native
  
  def splitViewContainer(): SplitViewBuilder = js.native
  
  def table(): ComponentBuilder[TableComponent] = js.native
  
  def text(): ComponentBuilder[TextComponent] = js.native
  
  def toolbarContainer(): ToolbarBuilder = js.native
  
  def tree[T](): ComponentBuilder[TreeComponent[T]] = js.native
  
  def webView(): ComponentBuilder[WebViewComponent] = js.native
}
object ModelBuilder {
  
  @scala.inline
  def apply(
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
    navContainer: () => ContainerBuilder[NavContainer, _, _],
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
  
  @scala.inline
  implicit class ModelBuilderMutableBuilder[Self <: ModelBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButton(value: () => ComponentBuilder[ButtonComponent]): Self = StObject.set(x, "button", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCard(value: () => ComponentBuilder[CardComponent]): Self = StObject.set(x, "card", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCheckBox(value: () => ComponentBuilder[CheckBoxComponent]): Self = StObject.set(x, "checkBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDashboardWebview(value: String => ComponentBuilder[DashboardWebviewComponent]): Self = StObject.set(x, "dashboardWebview", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDashboardWidget(value: String => ComponentBuilder[DashboardWidgetComponent]): Self = StObject.set(x, "dashboardWidget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeclarativeTable(value: () => ComponentBuilder[DeclarativeTableComponent]): Self = StObject.set(x, "declarativeTable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDiffeditor(value: () => ComponentBuilder[DiffEditorComponent]): Self = StObject.set(x, "diffeditor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDivContainer(value: () => DivBuilder): Self = StObject.set(x, "divContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDom(value: () => ComponentBuilder[DomComponent]): Self = StObject.set(x, "dom", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDropDown(value: () => ComponentBuilder[DropDownComponent]): Self = StObject.set(x, "dropDown", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEditor(value: () => ComponentBuilder[EditorComponent]): Self = StObject.set(x, "editor", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFileBrowserTree(value: () => ComponentBuilder[FileBrowserTreeComponent]): Self = StObject.set(x, "fileBrowserTree", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFlexContainer(value: () => FlexBuilder): Self = StObject.set(x, "flexContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFormContainer(value: () => FormBuilder): Self = StObject.set(x, "formContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroupContainer(value: () => GroupBuilder): Self = StObject.set(x, "groupContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHyperlink(value: () => ComponentBuilder[HyperlinkComponent]): Self = StObject.set(x, "hyperlink", js.Any.fromFunction0(value))
    
    @scala.inline
    def setImage(value: () => ComponentBuilder[ImageComponent]): Self = StObject.set(x, "image", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInputBox(value: () => ComponentBuilder[InputBoxComponent]): Self = StObject.set(x, "inputBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setListBox(value: () => ComponentBuilder[ListBoxComponent]): Self = StObject.set(x, "listBox", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLoadingComponent(value: () => LoadingComponentBuilder): Self = StObject.set(x, "loadingComponent", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNavContainer(value: () => ContainerBuilder[NavContainer, _, _]): Self = StObject.set(x, "navContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRadioButton(value: () => ComponentBuilder[RadioButtonComponent]): Self = StObject.set(x, "radioButton", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSplitViewContainer(value: () => SplitViewBuilder): Self = StObject.set(x, "splitViewContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTable(value: () => ComponentBuilder[TableComponent]): Self = StObject.set(x, "table", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: () => ComponentBuilder[TextComponent]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToolbarContainer(value: () => ToolbarBuilder): Self = StObject.set(x, "toolbarContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTree(value: () => ComponentBuilder[TreeComponent[js.Any]]): Self = StObject.set(x, "tree", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWebView(value: () => ComponentBuilder[WebViewComponent]): Self = StObject.set(x, "webView", js.Any.fromFunction0(value))
  }
}
