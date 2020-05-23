package typings.chui

import typings.chui.anon.ArticleId
import typings.chui.anon.Background
import typings.chui.anon.Call
import typings.chui.anon.Callback
import typings.chui.anon.Checked
import typings.chui.anon.ClassName
import typings.chui.anon.Data
import typings.chui.anon.Dynamic
import typings.chui.anon.Icons
import typings.chui.anon.Id
import typings.chui.anon.Pagination
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for jQuery
  */
@js.native
trait JQueryStatic extends js.Object {
  /**
    * Tell ChocolateChip-UI to not modify window hash during navigation.
    * The default value is false.
    */
  var UIBrowserHashModification: Boolean = js.native
  /**
    * An array of the navigation history. Do not manipulate this. For examination only. This is used by navigation lists, etc.
    */
  var UINavigationHistory: js.Array[String] = js.native
  /**
    * Creates and initializes a slide out menu. Possible options: {dynamic: true, callback: function() { alert("Woohoo!");}}
    */
  @JSName("UISlideout")
  var UISlideout_Original: Call = js.native
  /**
    * The body tag wrapped and ready to use: $.body.css('background-color','orange')
    */
  var body: JQuery = js.native
  /**
    * Alias for cross-platform events: pointercancel, MSPointerCancel, touchcancel and mouseout.
    */
  var eventCancel: ChUIEventInterface = js.native
  /**
    * Alias for cross-platform events: pointerup, MSPointerUp, touchend and mouseup.
    */
  var eventEnd: ChUIEventInterface = js.native
  /**
    * Alias for cross-platform events: pointermove, MSPointerMove, touchmove and mousemove.
    */
  var eventMove: ChUIEventInterface = js.native
  /**
    * Alias for cross-platform events: pointerdown, MSPointerDown, touchstart and mousedown.
    */
  var eventStart: ChUIEventInterface = js.native
  /**
    * Whether OS is Android
    */
  var isAndroid: Boolean = js.native
  /**
    * Whether OS is Blackberry.
    */
  var isBlackberry: Boolean = js.native
  /**
    * Whether browser is Chrome.
    */
  var isChrome: Boolean = js.native
  /**
    * Whether browser is running on desktop.
    */
  var isDesktop: Boolean = js.native
  /**
    * Whether browser is IE10.
    */
  var isIE10: Boolean = js.native
  /**
    * Whether browser is IE11.
    */
  var isIE11: Boolean = js.native
  /**
    * Whether browser is Microsoft Edge or not.
    */
  var isIEEdge: Boolean = js.native
  /**
    * Whether browser is running on mobile device.
    */
  var isMobile: Boolean = js.native
  /**
    * Is native Android browser (not mobile Chrome).
    */
  var isNativeAndroid: Boolean = js.native
  /**
    * Determine whether navigation is in progress or not.
    */
  var isNavigating: Boolean = js.native
  /**
    * Whether there is a network connection.
    */
  var isOnline: Boolean = js.native
  /**
    * Whether browser is Safari.
    */
  var isSafari: Boolean = js.native
  /**
    * Whether app is running in stanalone mode.
    */
  var isStandalone: Boolean = js.native
  /**
    * Whether OS supports touch events.
    */
  var isTouchEnabled: Boolean = js.native
  /**
    * Whether OS is WebOS.
    */
  var isWebOS: Boolean = js.native
  /**
    * Whether browser is Webkit based.
    */
  var isWebkit: Boolean = js.native
  /**
    * Whether screen is at least 960 pixels wide.
    */
  var isWideScreen: Boolean = js.native
  /**
    * Whether screen is at least 960 pixels wide and in portrait orientation.
    */
  var isWideScreenPortrait: Boolean = js.native
  /**
    * Whether OS is Windows.
    */
  var isWin: Boolean = js.native
  /**
    * Whether device is Windows Phone.
    */
  var isWinPhone: Boolean = js.native
  /**
    * Whether OS is iOS.
    */
  var isiOS: Boolean = js.native
  /**
    * Whether OS is iOS 6.
    */
  var isiOS6: Boolean = js.native
  /**
    * Whether OS i iOS 7.
    */
  var isiOS7: Boolean = js.native
  /**
    * Whether device is iPad.
    */
  var isiPad: Boolean = js.native
  /**
    * Whether device is iPhone.
    */
  var isiPhone: Boolean = js.native
  /**
    * Whether device is iPod.
    */
  var isiPod: Boolean = js.native
  /**
    * This method returns a parsed template.
    *
    */
  @JSName("template")
  var template_Original: Data = js.native
  /**
    * Object used to store string templates and parsed templates.
    *
    * @param string A string defining the template.
    * @param string A label used to access an object's properties in the template. If none is provided it defaults to "data": [[= data.name]].
    * @return void
    */
  var templates: js.Object = js.native
  /**
    * Bind the values of data-models to elements with data-controllers: <input id='myText' data-controller='input-value' type='text'></li><h3 data-model='input-value'></h3>.
    * You can bind a single model to its controller by providing its name as the argument: $.UIBindData('input-value');
    *
    * @param controller A string indicating the controller whose value a model is bound to.
    * @return void
    */
  def UIBindData(): Unit = js.native
  def UIBindData(controller: String): Unit = js.native
  /**
    * Display a transparent screen over the UI.
    *
    * @param opacity The percentage of opacity for the screen.
    * @return void
    */
  def UIBlock(): Unit = js.native
  def UIBlock(opacity: Double): Unit = js.native
  /**
    * Create a segmented control: {id: "mySegments", className: "seggie", labels: ["one", "two","three"], selected: 1}
    *
    * @param: options UICreateSegmentedOptions
    * @return JQuery
    */
  def UICreateSegmented(options: ClassName): JQuery = js.native
  /**
    * Create a switch control. Possible options: { id: '#myId', name: 'fruit.mango', state: 'on', value: 'Mango', checked: 'on', style: 'traditional', callback: function() { alert('hi');}}
    *
    * @return void
    */
  def UICreateSwitch(): Unit = js.native
  def UICreateSwitch(options: Checked): Unit = js.native
  /**
    * Method to tell ChocolateChip-UI to register navigation history on Window hash.
    */
  def UIEnableBrowserHashModification(): Unit = js.native
  /**
    * Go back to the previous article from whence you came. This resets the navigation history array.
    *
    * @return void
    */
  def UIGoBack(): Unit = js.native
  /**
    * Go back to the article indicated by the provided ID. This is for non-linear back navigation. This will reset the navigation history array to match the current state.
    *
    * @return void
    */
  def UIGoBackToArticle(articleID: String): Unit = js.native
  /**
    * Navigate to the article indicated by the provided destination ID. This enters the destination into the navigation history array.
    *
    * @param destination An id for the article to navigate to.
    * @return void
    */
  def UIGoToArticle(destination: String): Unit = js.native
  /**
    * Hide the navigation bar, raising up the content below it.
    */
  def UIHideNavBar(): Unit = js.native
  /**
    * Hide any currently displayed sheets.
    *
    * @return void
    */
  def UIHideSheet(): Unit = js.native
  /**
    * Initialize a horiontal or vertical paging control. This uses a segmented control in the navigation bar with a class
    * like "segmented paging horizontal" or "segmented paging vertical". It uses a single article with multiple sections to paginate.
    *
    * @return void
    */
  def UIPaging(): Unit = js.native
  /**
    * Create and show a Popover. Options: {id: "#myPopover", title: "Whatever", callback: function() {console.log('Blah!');}}.
    *
    * @param options UIPopoverOptions
    * @return void
    */
  def UIPopover(): Unit = js.native
  def UIPopover(options: Id): Unit = js.native
  /**
    * Close any currently visible popovers.
    *
    * @return void
    */
  def UIPopoverClose(): Unit = js.native
  /**
    * Create and show a Popup with title and message. Possible options: {id: "#myPopup", title: "My Popup",
    * message: "Woohoo!", cancelButton: "Forget It!", contiueButton: "Whatever", callback: function() {console.log('Blah!');}, empty: false }.
    *
    * @param options UIPopupOptions
    * @return void
    */
  def UIPopup(): Unit = js.native
  def UIPopup(options: Callback): Unit = js.native
  /**
    * Reset the value of the stepper to its defaults at initialization. Pass it a reference to the stepper to reset.
    *
    * @return void
    */
  def UIResetStepper(stepper: JQuery): Unit = js.native
  /**
    * Create a search bar for an article. Options: { articleId: '#products', id: 'productSearch', placeholder: 'Find a product', results: 5 }
    *
    * @return void
    */
  def UISearch(): Unit = js.native
  def UISearch(options: ArticleId): Unit = js.native
  /**
    * Create and initialize a swipable carousel. Options: {target : '#myCarousel', panels: ['<p>stuff</p>','<p>more</p>'], loop: true, pagination: true }
    *
    * @return void
    */
  def UISetupCarousel(options: Pagination): Unit = js.native
  /**
    * Creates a sheet. Minimum option is an id: {id : 'starTrek', listClass :'enterprise', background: 'transparent', handle: false }
    *
    * @return void
    */
  def UISheet(options: Background): Unit = js.native
  /**
    * If the navigation bar is hidden, show it, pushing down the content to make room.
    */
  def UIShowNavBar(): Unit = js.native
  /**
    * Show a sheet by passing this its ID.
    *
    * @return void
    */
  def UIShowSheet(id: String): Unit = js.native
  /**
    * Creates and initializes a slide out menu. Possible options: {dynamic: true, callback: function() { alert("Woohoo!");}}
    *
    * @return void
    */
  /**
    * Creates and initializes a slide out menu. Possible options: {dynamic: true, callback: function() { alert("Woohoo!");}}
    */
  def UISlideout(): js.Any = js.native
  def UISlideout(options: Dynamic): js.Any = js.native
  /**
    * Creates a tabbar. On iOS this is at the bottom of the screen. On Android and Windows, it is at the top.
    * Options: {id: 'mySpecialTabbar', tabs: 4, labels: ["Refresh", "Add", "Info", "Downloads", "Favorite"], icons: ["refresh", "add", "info", "downloads", "favorite"], selected: 2 }
    *
    * @return void
    */
  def UITabbar(): Unit = js.native
  def UITabbar(options: Icons): Unit = js.native
  /**
    * Unbind the values of data-models from their data-controllers.
    * If you provide a controller name as the argument, only that controller will be unbound.
    *
    * @param controller A controller to unbind.
    * @return void
    */
  def UIUnBindData(): Unit = js.native
  def UIUnBindData(controller: String): Unit = js.native
  /**
    * Remove the transparent screen covering the UI.
    *
    * @return void
    */
  def UIUnblock(): Unit = js.native
  /**
    * Return the version of the current browser.
    */
  def browserVersion(): Double = js.native
  /**
    * This method will concatenate strings or values as a cleaner alternative to using the '+' operator.
    *
    * @param string or number A comma separated series of strings to concatenate.
    * @return string
    */
  def concat(string: String*): String = js.native
  /**
    * The method will iterate over an array.
    *
    * @param obj An iterable object.
    * @param callback A callback to execute on each loop.
    * @param args Any arguments you need to pass to the callback.
    */
  def forEach(obj: js.Array[_], callback: js.Function): js.Any = js.native
  def forEach(obj: js.Array[_], callback: js.Function, args: js.Any): js.Any = js.native
  /**
    * This method parses a string and an optoinal variable name and returns a parsed template in the form of a function. You can then pass this function data to get rendered nodes.
    *
    * @param template A string of markup to use as a template.
    * @param variable An option name to use in the template. If it were "myData": [[= myData.name]]. Otherwise it defaults to "data": [[= data.name]].
    * @return A function.
    */
  /**
    * This method returns a parsed template.
    *
    */
  def template(template: String): js.Function = js.native
  def template(template: String, variable: String): js.Function = js.native
}

