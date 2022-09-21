package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelBuilder extends StObject {
  
  def button(): ComponentBuilder[ButtonComponent, ButtonProperties]
  
  /**
    * @deprecated please use radioCardGroup component.
    */
  def card(): ComponentBuilder[CardComponent, CardProperties]
  
  def checkBox(): ComponentBuilder[CheckBoxComponent, CheckBoxProperties]
  
  def dashboardWebview(webviewId: String): ComponentBuilder[DashboardWebviewComponent, ComponentProperties]
  
  def dashboardWidget(widgetId: String): ComponentBuilder[DashboardWidgetComponent, ComponentProperties]
  
  def declarativeTable(): ComponentBuilder[DeclarativeTableComponent, DeclarativeTableProperties]
  
  def diffeditor(): ComponentBuilder[DiffEditorComponent, DiffEditorProperties]
  
  def divContainer(): DivBuilder
  
  def dropDown(): ComponentBuilder[DropDownComponent, DropDownProperties]
  
  def editor(): ComponentBuilder[EditorComponent, EditorProperties]
  
  def fileBrowserTree(): ComponentBuilder[FileBrowserTreeComponent, FileBrowserTreeProperties]
  
  def flexContainer(): FlexBuilder
  
  def formContainer(): FormBuilder
  
  def groupContainer(): GroupBuilder
  
  def hyperlink(): ComponentBuilder[HyperlinkComponent, HyperlinkComponentProperties]
  
  def image(): ComponentBuilder[ImageComponent, ImageComponentProperties]
  
  def infoBox(): ComponentBuilder[InfoBoxComponent, InfoBoxComponentProperties]
  
  def inputBox(): ComponentBuilder[InputBoxComponent, InputBoxProperties]
  
  def listBox(): ComponentBuilder[ListBoxComponent, ListBoxProperties]
  
  def listView(): ComponentBuilder[ListViewComponent, ListViewComponentProperties]
  
  def loadingComponent(): LoadingComponentBuilder
  
  def navContainer(): ContainerBuilder[NavContainer, Any, Any, ContainerProperties]
  
  def propertiesContainer(): ComponentBuilder[PropertiesContainerComponent, PropertiesContainerComponentProperties]
  
  def radioButton(): ComponentBuilder[RadioButtonComponent, RadioButtonProperties]
  
  def radioCardGroup(): ComponentBuilder[RadioCardGroupComponent, RadioCardGroupComponentProperties]
  
  def separator(): ComponentBuilder[SeparatorComponent, SeparatorComponentProperties]
  
  def slider(): ComponentBuilder[SliderComponent, SliderComponentProperties]
  
  def splitViewContainer(): SplitViewBuilder
  
  def tabbedPanel(): TabbedPanelComponentBuilder
  
  def table(): ComponentBuilder[TableComponent, TableComponentProperties]
  
  def text(): ComponentBuilder[TextComponent, TextComponentProperties]
  
  def toolbarContainer(): ToolbarBuilder
  
  def tree[T](): ComponentBuilder[TreeComponent[T], TreeProperties]
  
  def webView(): ComponentBuilder[WebViewComponent, WebViewProperties]
}
object ModelBuilder {
  
  inline def apply(
    button: () => ComponentBuilder[ButtonComponent, ButtonProperties],
    card: () => ComponentBuilder[CardComponent, CardProperties],
    checkBox: () => ComponentBuilder[CheckBoxComponent, CheckBoxProperties],
    dashboardWebview: String => ComponentBuilder[DashboardWebviewComponent, ComponentProperties],
    dashboardWidget: String => ComponentBuilder[DashboardWidgetComponent, ComponentProperties],
    declarativeTable: () => ComponentBuilder[DeclarativeTableComponent, DeclarativeTableProperties],
    diffeditor: () => ComponentBuilder[DiffEditorComponent, DiffEditorProperties],
    divContainer: () => DivBuilder,
    dropDown: () => ComponentBuilder[DropDownComponent, DropDownProperties],
    editor: () => ComponentBuilder[EditorComponent, EditorProperties],
    fileBrowserTree: () => ComponentBuilder[FileBrowserTreeComponent, FileBrowserTreeProperties],
    flexContainer: () => FlexBuilder,
    formContainer: () => FormBuilder,
    groupContainer: () => GroupBuilder,
    hyperlink: () => ComponentBuilder[HyperlinkComponent, HyperlinkComponentProperties],
    image: () => ComponentBuilder[ImageComponent, ImageComponentProperties],
    infoBox: () => ComponentBuilder[InfoBoxComponent, InfoBoxComponentProperties],
    inputBox: () => ComponentBuilder[InputBoxComponent, InputBoxProperties],
    listBox: () => ComponentBuilder[ListBoxComponent, ListBoxProperties],
    listView: () => ComponentBuilder[ListViewComponent, ListViewComponentProperties],
    loadingComponent: () => LoadingComponentBuilder,
    navContainer: () => ContainerBuilder[NavContainer, Any, Any, ContainerProperties],
    propertiesContainer: () => ComponentBuilder[PropertiesContainerComponent, PropertiesContainerComponentProperties],
    radioButton: () => ComponentBuilder[RadioButtonComponent, RadioButtonProperties],
    radioCardGroup: () => ComponentBuilder[RadioCardGroupComponent, RadioCardGroupComponentProperties],
    separator: () => ComponentBuilder[SeparatorComponent, SeparatorComponentProperties],
    slider: () => ComponentBuilder[SliderComponent, SliderComponentProperties],
    splitViewContainer: () => SplitViewBuilder,
    tabbedPanel: () => TabbedPanelComponentBuilder,
    table: () => ComponentBuilder[TableComponent, TableComponentProperties],
    text: () => ComponentBuilder[TextComponent, TextComponentProperties],
    toolbarContainer: () => ToolbarBuilder,
    tree: () => ComponentBuilder[TreeComponent[Any], TreeProperties],
    webView: () => ComponentBuilder[WebViewComponent, WebViewProperties]
  ): ModelBuilder = {
    val __obj = js.Dynamic.literal(button = js.Any.fromFunction0(button), card = js.Any.fromFunction0(card), checkBox = js.Any.fromFunction0(checkBox), dashboardWebview = js.Any.fromFunction1(dashboardWebview), dashboardWidget = js.Any.fromFunction1(dashboardWidget), declarativeTable = js.Any.fromFunction0(declarativeTable), diffeditor = js.Any.fromFunction0(diffeditor), divContainer = js.Any.fromFunction0(divContainer), dropDown = js.Any.fromFunction0(dropDown), editor = js.Any.fromFunction0(editor), fileBrowserTree = js.Any.fromFunction0(fileBrowserTree), flexContainer = js.Any.fromFunction0(flexContainer), formContainer = js.Any.fromFunction0(formContainer), groupContainer = js.Any.fromFunction0(groupContainer), hyperlink = js.Any.fromFunction0(hyperlink), image = js.Any.fromFunction0(image), infoBox = js.Any.fromFunction0(infoBox), inputBox = js.Any.fromFunction0(inputBox), listBox = js.Any.fromFunction0(listBox), listView = js.Any.fromFunction0(listView), loadingComponent = js.Any.fromFunction0(loadingComponent), navContainer = js.Any.fromFunction0(navContainer), propertiesContainer = js.Any.fromFunction0(propertiesContainer), radioButton = js.Any.fromFunction0(radioButton), radioCardGroup = js.Any.fromFunction0(radioCardGroup), separator = js.Any.fromFunction0(separator), slider = js.Any.fromFunction0(slider), splitViewContainer = js.Any.fromFunction0(splitViewContainer), tabbedPanel = js.Any.fromFunction0(tabbedPanel), table = js.Any.fromFunction0(table), text = js.Any.fromFunction0(text), toolbarContainer = js.Any.fromFunction0(toolbarContainer), tree = js.Any.fromFunction0(tree), webView = js.Any.fromFunction0(webView))
    __obj.asInstanceOf[ModelBuilder]
  }
  
  extension [Self <: ModelBuilder](x: Self) {
    
    inline def setButton(value: () => ComponentBuilder[ButtonComponent, ButtonProperties]): Self = StObject.set(x, "button", js.Any.fromFunction0(value))
    
    inline def setCard(value: () => ComponentBuilder[CardComponent, CardProperties]): Self = StObject.set(x, "card", js.Any.fromFunction0(value))
    
    inline def setCheckBox(value: () => ComponentBuilder[CheckBoxComponent, CheckBoxProperties]): Self = StObject.set(x, "checkBox", js.Any.fromFunction0(value))
    
    inline def setDashboardWebview(value: String => ComponentBuilder[DashboardWebviewComponent, ComponentProperties]): Self = StObject.set(x, "dashboardWebview", js.Any.fromFunction1(value))
    
    inline def setDashboardWidget(value: String => ComponentBuilder[DashboardWidgetComponent, ComponentProperties]): Self = StObject.set(x, "dashboardWidget", js.Any.fromFunction1(value))
    
    inline def setDeclarativeTable(value: () => ComponentBuilder[DeclarativeTableComponent, DeclarativeTableProperties]): Self = StObject.set(x, "declarativeTable", js.Any.fromFunction0(value))
    
    inline def setDiffeditor(value: () => ComponentBuilder[DiffEditorComponent, DiffEditorProperties]): Self = StObject.set(x, "diffeditor", js.Any.fromFunction0(value))
    
    inline def setDivContainer(value: () => DivBuilder): Self = StObject.set(x, "divContainer", js.Any.fromFunction0(value))
    
    inline def setDropDown(value: () => ComponentBuilder[DropDownComponent, DropDownProperties]): Self = StObject.set(x, "dropDown", js.Any.fromFunction0(value))
    
    inline def setEditor(value: () => ComponentBuilder[EditorComponent, EditorProperties]): Self = StObject.set(x, "editor", js.Any.fromFunction0(value))
    
    inline def setFileBrowserTree(value: () => ComponentBuilder[FileBrowserTreeComponent, FileBrowserTreeProperties]): Self = StObject.set(x, "fileBrowserTree", js.Any.fromFunction0(value))
    
    inline def setFlexContainer(value: () => FlexBuilder): Self = StObject.set(x, "flexContainer", js.Any.fromFunction0(value))
    
    inline def setFormContainer(value: () => FormBuilder): Self = StObject.set(x, "formContainer", js.Any.fromFunction0(value))
    
    inline def setGroupContainer(value: () => GroupBuilder): Self = StObject.set(x, "groupContainer", js.Any.fromFunction0(value))
    
    inline def setHyperlink(value: () => ComponentBuilder[HyperlinkComponent, HyperlinkComponentProperties]): Self = StObject.set(x, "hyperlink", js.Any.fromFunction0(value))
    
    inline def setImage(value: () => ComponentBuilder[ImageComponent, ImageComponentProperties]): Self = StObject.set(x, "image", js.Any.fromFunction0(value))
    
    inline def setInfoBox(value: () => ComponentBuilder[InfoBoxComponent, InfoBoxComponentProperties]): Self = StObject.set(x, "infoBox", js.Any.fromFunction0(value))
    
    inline def setInputBox(value: () => ComponentBuilder[InputBoxComponent, InputBoxProperties]): Self = StObject.set(x, "inputBox", js.Any.fromFunction0(value))
    
    inline def setListBox(value: () => ComponentBuilder[ListBoxComponent, ListBoxProperties]): Self = StObject.set(x, "listBox", js.Any.fromFunction0(value))
    
    inline def setListView(value: () => ComponentBuilder[ListViewComponent, ListViewComponentProperties]): Self = StObject.set(x, "listView", js.Any.fromFunction0(value))
    
    inline def setLoadingComponent(value: () => LoadingComponentBuilder): Self = StObject.set(x, "loadingComponent", js.Any.fromFunction0(value))
    
    inline def setNavContainer(value: () => ContainerBuilder[NavContainer, Any, Any, ContainerProperties]): Self = StObject.set(x, "navContainer", js.Any.fromFunction0(value))
    
    inline def setPropertiesContainer(
      value: () => ComponentBuilder[PropertiesContainerComponent, PropertiesContainerComponentProperties]
    ): Self = StObject.set(x, "propertiesContainer", js.Any.fromFunction0(value))
    
    inline def setRadioButton(value: () => ComponentBuilder[RadioButtonComponent, RadioButtonProperties]): Self = StObject.set(x, "radioButton", js.Any.fromFunction0(value))
    
    inline def setRadioCardGroup(value: () => ComponentBuilder[RadioCardGroupComponent, RadioCardGroupComponentProperties]): Self = StObject.set(x, "radioCardGroup", js.Any.fromFunction0(value))
    
    inline def setSeparator(value: () => ComponentBuilder[SeparatorComponent, SeparatorComponentProperties]): Self = StObject.set(x, "separator", js.Any.fromFunction0(value))
    
    inline def setSlider(value: () => ComponentBuilder[SliderComponent, SliderComponentProperties]): Self = StObject.set(x, "slider", js.Any.fromFunction0(value))
    
    inline def setSplitViewContainer(value: () => SplitViewBuilder): Self = StObject.set(x, "splitViewContainer", js.Any.fromFunction0(value))
    
    inline def setTabbedPanel(value: () => TabbedPanelComponentBuilder): Self = StObject.set(x, "tabbedPanel", js.Any.fromFunction0(value))
    
    inline def setTable(value: () => ComponentBuilder[TableComponent, TableComponentProperties]): Self = StObject.set(x, "table", js.Any.fromFunction0(value))
    
    inline def setText(value: () => ComponentBuilder[TextComponent, TextComponentProperties]): Self = StObject.set(x, "text", js.Any.fromFunction0(value))
    
    inline def setToolbarContainer(value: () => ToolbarBuilder): Self = StObject.set(x, "toolbarContainer", js.Any.fromFunction0(value))
    
    inline def setTree(value: () => ComponentBuilder[TreeComponent[Any], TreeProperties]): Self = StObject.set(x, "tree", js.Any.fromFunction0(value))
    
    inline def setWebView(value: () => ComponentBuilder[WebViewComponent, WebViewProperties]): Self = StObject.set(x, "webView", js.Any.fromFunction0(value))
  }
}
