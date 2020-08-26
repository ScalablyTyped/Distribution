package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelBuilder extends js.Object {
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
  implicit class ModelBuilderOps[Self <: ModelBuilder] (val x: Self) extends AnyVal {
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
    def setButton(value: () => ComponentBuilder[ButtonComponent]): Self = this.set("button", js.Any.fromFunction0(value))
    @scala.inline
    def setCard(value: () => ComponentBuilder[CardComponent]): Self = this.set("card", js.Any.fromFunction0(value))
    @scala.inline
    def setCheckBox(value: () => ComponentBuilder[CheckBoxComponent]): Self = this.set("checkBox", js.Any.fromFunction0(value))
    @scala.inline
    def setDashboardWebview(value: String => ComponentBuilder[DashboardWebviewComponent]): Self = this.set("dashboardWebview", js.Any.fromFunction1(value))
    @scala.inline
    def setDashboardWidget(value: String => ComponentBuilder[DashboardWidgetComponent]): Self = this.set("dashboardWidget", js.Any.fromFunction1(value))
    @scala.inline
    def setDeclarativeTable(value: () => ComponentBuilder[DeclarativeTableComponent]): Self = this.set("declarativeTable", js.Any.fromFunction0(value))
    @scala.inline
    def setDiffeditor(value: () => ComponentBuilder[DiffEditorComponent]): Self = this.set("diffeditor", js.Any.fromFunction0(value))
    @scala.inline
    def setDivContainer(value: () => DivBuilder): Self = this.set("divContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setDom(value: () => ComponentBuilder[DomComponent]): Self = this.set("dom", js.Any.fromFunction0(value))
    @scala.inline
    def setDropDown(value: () => ComponentBuilder[DropDownComponent]): Self = this.set("dropDown", js.Any.fromFunction0(value))
    @scala.inline
    def setEditor(value: () => ComponentBuilder[EditorComponent]): Self = this.set("editor", js.Any.fromFunction0(value))
    @scala.inline
    def setFileBrowserTree(value: () => ComponentBuilder[FileBrowserTreeComponent]): Self = this.set("fileBrowserTree", js.Any.fromFunction0(value))
    @scala.inline
    def setFlexContainer(value: () => FlexBuilder): Self = this.set("flexContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setFormContainer(value: () => FormBuilder): Self = this.set("formContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setGroupContainer(value: () => GroupBuilder): Self = this.set("groupContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setHyperlink(value: () => ComponentBuilder[HyperlinkComponent]): Self = this.set("hyperlink", js.Any.fromFunction0(value))
    @scala.inline
    def setImage(value: () => ComponentBuilder[ImageComponent]): Self = this.set("image", js.Any.fromFunction0(value))
    @scala.inline
    def setInputBox(value: () => ComponentBuilder[InputBoxComponent]): Self = this.set("inputBox", js.Any.fromFunction0(value))
    @scala.inline
    def setListBox(value: () => ComponentBuilder[ListBoxComponent]): Self = this.set("listBox", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadingComponent(value: () => LoadingComponentBuilder): Self = this.set("loadingComponent", js.Any.fromFunction0(value))
    @scala.inline
    def setNavContainer(value: () => ContainerBuilder[NavContainer, _, _]): Self = this.set("navContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setRadioButton(value: () => ComponentBuilder[RadioButtonComponent]): Self = this.set("radioButton", js.Any.fromFunction0(value))
    @scala.inline
    def setSplitViewContainer(value: () => SplitViewBuilder): Self = this.set("splitViewContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setTable(value: () => ComponentBuilder[TableComponent]): Self = this.set("table", js.Any.fromFunction0(value))
    @scala.inline
    def setText(value: () => ComponentBuilder[TextComponent]): Self = this.set("text", js.Any.fromFunction0(value))
    @scala.inline
    def setToolbarContainer(value: () => ToolbarBuilder): Self = this.set("toolbarContainer", js.Any.fromFunction0(value))
    @scala.inline
    def setTree(value: () => ComponentBuilder[TreeComponent[js.Any]]): Self = this.set("tree", js.Any.fromFunction0(value))
    @scala.inline
    def setWebView(value: () => ComponentBuilder[WebViewComponent]): Self = this.set("webView", js.Any.fromFunction0(value))
  }
  
}

