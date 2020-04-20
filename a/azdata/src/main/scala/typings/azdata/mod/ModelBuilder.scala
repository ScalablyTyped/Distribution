package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelBuilder extends js.Object {
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
  def navContainer(): ContainerBuilder[NavContainer, _, _]
  def radioButton(): ComponentBuilder[RadioButtonComponent]
  def splitViewContainer(): SplitViewBuilder
  def table(): ComponentBuilder[TableComponent]
  def text(): ComponentBuilder[TextComponent]
  def toolbarContainer(): ToolbarBuilder
  def tree[T](): ComponentBuilder[TreeComponent[T]]
  def webView(): ComponentBuilder[WebViewComponent]
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
}

