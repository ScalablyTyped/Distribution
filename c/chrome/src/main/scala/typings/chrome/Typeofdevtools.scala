package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofdevtools extends js.Object {
  ////////////////////
  // Dev Tools - Inspected Window
  ////////////////////
  /**
    * Use the chrome.devtools.inspectedWindow API to interact with the inspected window: obtain the tab ID for the inspected page, evaluate the code in the context of the inspected window, reload the page, or obtain the list of resources within the page.
    * Availability: Since Chrome 18.
    */
  val inspectedWindowNs: TypeofinspectedWindow
  ////////////////////
  // Dev Tools - Network
  ////////////////////
  /**
    * Use the chrome.devtools.network API to retrieve the information about network requests displayed by the Developer Tools in the Network panel.
    * Availability: Since Chrome 18.
    */
  val networkNs: Typeofnetwork
  ////////////////////
  // Dev Tools - Panels
  ////////////////////
  /**
    * Use the chrome.devtools.panels API to integrate your extension into Developer Tools window UI: create your own panels, access existing panels, and add sidebars.
    * Availability: Since Chrome 18.
    */
  val panelsNs: Typeofpanels
}

object Typeofdevtools {
  @scala.inline
  def apply(inspectedWindowNs: TypeofinspectedWindow, networkNs: Typeofnetwork, panelsNs: Typeofpanels): Typeofdevtools = {
    val __obj = js.Dynamic.literal(inspectedWindowNs = inspectedWindowNs, networkNs = networkNs, panelsNs = panelsNs)
  
    __obj.asInstanceOf[Typeofdevtools]
  }
}

