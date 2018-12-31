package typings
package chuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChocolateChipStatic extends js.Object {
  /**
    * Tell ChocolateChip-UI to not modify window hash during navigation.
    * The default value is false.
    */
  var UIBrowserHashModification: scala.Boolean = js.native
  /**
    * An array of the navigation history. Do not manipulate this. For examination only. This is used by navigation lists, etc.
    */
  var UINavigationHistory: js.Array[java.lang.String] = js.native
  /**
    * Creates and initializes a slide out menu. Possible options: {dynamic: true, callback: function() { alert("Woohoo!");}}
    */
  @JSName("UISlideout")
  var UISlideout_Original: Anon_Options = js.native
  /**
    * The body tag wrapped and ready to use: $.body.css('background-color','orange')
    */
  var body: ChocolateChipElementArray = js.native
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
    * Whether browser is Microsoft Edge or not.
    */
  var isIEEdge: scala.Boolean = js.native
  /**
    * Determine whether navigation is in progress or not.
    */
  var isNavigating: scala.Boolean = js.native
  /**
    * Whether screen is at least 960 pixels wide.
    */
  var isWideScreen: scala.Boolean = js.native
  /**
    * Whether screen is at least 960 pixels wide and in portrait orientation.
    */
  var isWideScreenPortrait: scala.Boolean = js.native
  /**
    * Bind the values of data-models to elements with data-controllers: <input id='myText' data-controller='input-value' type='text'></li><h3 data-model='input-value'></h3>.
    * You can bind a single model to its controller by providing its name as the argument: $.UIBindData('input-value');
    *
    * @param controller A string indicating the controller whose value a model is bound to.
    * @return void
    */
  def UIBindData(): scala.Unit = js.native
  def UIBindData(controller: java.lang.String): scala.Unit = js.native
  /**
    * Display a transparent screen over the UI.
    *
    * @param opacity The percentage of opacity for the screen.
    * @return void
    */
  def UIBlock(): scala.Unit = js.native
  def UIBlock(opacity: scala.Double): scala.Unit = js.native
  /**
    * Create a segmented control: {id: "mySegments", className: "seggie", labels: ["one", "two","three"], selected: 1}
    *
    * param: options UICreateSegmentedOptions
    */
  def UICreateSegmented(): ChocolateChipElementArray = js.native
  def UICreateSegmented(options: Anon_ClassName): ChocolateChipElementArray = js.native
  /**
    * Create a switch control. Possible options: { id: '#myId', name: 'fruit.mango', state: 'on', value: 'Mango', checked: 'on', style: 'traditional', callback: function() { alert('hi');}}
    *
    * @return void
    */
  def UICreateSwitch(): scala.Unit = js.native
  def UICreateSwitch(options: Anon_Name): scala.Unit = js.native
  /**
    * Method to tell ChocolateChip-UI to register navigation history on Window hash.
    */
  def UIEnableBrowserHashModification(): scala.Unit = js.native
  /**
    * Go back to the previous article from whence you came. This resets the navigation history array.
    *
    * @return void
    */
  def UIGoBack(): scala.Unit = js.native
  /**
    * Go back to the article indicated by the provided ID. This is for non-linear back navigation. This will reset the navigation history array to match the current state.
    */
  def UIGoBackToArticle(articleID: java.lang.String): scala.Unit = js.native
  /**
    * Navigate to the article indicated by the provided destination ID. This enters the destination into the navigation history array.
    *
    * param destination An id for the article to navigate to.
    * @return void
    */
  def UIGoToArticle(destination: java.lang.String): scala.Unit = js.native
  /**
    * Hide the navigation bar, raising up the content below it.
    *
    * @return void
    */
  def UIHideNavBar(): scala.Unit = js.native
  /**
    * Hide any currently displayed sheets.
    *
    * @return void
    */
  def UIHideSheet(): scala.Unit = js.native
  /**
    * Initialize a horiontal or vertical paging control. This uses a segmented control in the navigation bar with a class
    * like "segmented paging horizontal" or "segmented paging vertical". It uses a single article with multiple sections to paginate.
    *
    * @return void
    */
  def UIPaging(): scala.Unit = js.native
  /**
    * Create and show a Popover. Options: {id: "#myPopover", title: "Whatever", callback: function() {console.log('Blah!');}}.
    *
    * param options UIPopoverOptions
    * @return void
    */
  def UIPopover(): scala.Unit = js.native
  def UIPopover(options: Anon_CallbackTitle): scala.Unit = js.native
  /**
    * Close any currently visible popovers.
    *
    * @return void
    */
  def UIPopoverClose(): scala.Unit = js.native
  /**
    * Create and show a Popup with title and message. Possible options: {id: "#myPopup", title: "My Popup",
    * message: "Woohoo!", cancelButton: "Forget It!", contiueButton: "Whatever", callback: function() {console.log('Blah!');}, empty: false }.
    *
    * param options UIPopupOptions
    */
  def UIPopup(): scala.Unit = js.native
  def UIPopup(options: Anon_Empty): scala.Unit = js.native
  /**
    * Reset the value of the stepper to its defaults at initialization. Pass it a reference to the stepper to reset.
    *
    * @return void
    */
  def UIResetStepper(stepper: js.Array[stdLib.HTMLElement]): scala.Unit = js.native
  /**
    * Create a search bar for an article. Options: { articleId: '#products', id: 'productSearch', placeholder: 'Find a product', results: 5 }
    *
    * @return void
    */
  def UISearch(): scala.Unit = js.native
  def UISearch(options: Anon_Results): scala.Unit = js.native
  /**
    * Create and initialize a swipable carousel. Options: {target : '#myCarousel', panels: ['<p>stuff</p>','<p>more</p>'], loop: true, pagination: true }
    *
    * @return void
    */
  def UISetupCarousel(options: Anon_Target): scala.Unit = js.native
  /**
    * Creates a sheet. Minimum option is an id: {id : 'starTrek', listClass :'enterprise', background: 'transparent', handle: false }
    *
    * @return void
    */
  def UISheet(options: Anon_ListClass): scala.Unit = js.native
  /**
    * If the navigation bar is hidden, show it, pushing down the content to make room.
    *
    * @return void
    */
  def UIShowNavBar(): scala.Unit = js.native
  /**
    * Show a sheet by passing this its ID.
    *
    * @return void
    */
  def UIShowSheet(id: java.lang.String): scala.Unit = js.native
  /**
    * Creates and initializes a slide out menu. Possible options: {dynamic: true, callback: function() { alert("Woohoo!");}}
    *
    * @return void
    */
  /**
    * Creates and initializes a slide out menu. Possible options: {dynamic: true, callback: function() { alert("Woohoo!");}}
    */
  def UISlideout(): js.Any = js.native
  def UISlideout(options: Anon_CallbackArgs): js.Any = js.native
  /**
    * Creates a tabbar. On iOS this is at the bottom of the screen. On Android and Windows, it is at the top.
    * Options: {id: 'mySpecialTabbar', tabs: 4, labels: ["Refresh", "Add", "Info", "Downloads", "Favorite"], icons: ["refresh", "add", "info", "downloads", "favorite"], selected: 2 }
    *
    * @return void
    */
  def UITabbar(): scala.Unit = js.native
  def UITabbar(options: Anon_Selected): scala.Unit = js.native
  /**
    * Unbind the values of data-models from their data-controllers.
    * If you provide a controller name as the argument, only that controller will be unbound.
    *
    * @param controller A controller to unbind.
    * @return void
    */
  def UIUnBindData(): scala.Unit = js.native
  def UIUnBindData(controller: java.lang.String): scala.Unit = js.native
  /**
    * Remove the transparent screen covering the UI.
    *
    * @return void
    */
  def UIUnblock(): scala.Unit = js.native
  /**
    * Return the version of the current browser.
    *
    * @return number Returns the current browser's version.
    */
  def browserVersion(): scala.Double = js.native
  /**
    * This method will concatenate strings or values as a cleaner alternative to using the '+' operator.
    *
    * @param string or number A comma separated series of strings to concatenate.
    * @return string
    */
  def concat(string: java.lang.String*): java.lang.String = js.native
  /**
    * The method will iterate over an array.
    *
    * @param obj An iterable object.
    * @param callback A callback to execute on each loop.
    * @param args Any arguments you need to pass to the callback.
    */
  def forEach(obj: js.Array[_], callback: js.Function): js.Any = js.native
  def forEach(obj: js.Array[_], callback: js.Function, args: js.Any): js.Any = js.native
}

