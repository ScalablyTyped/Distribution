package typings.chromeApps.chrome.app

import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bounds extends js.Object {
  
  /** This property can be used to read or write the current height of the content or window. */
  var height: integer = js.native
  
  /** This property can be used to read or write the current X coordinate of the content or window. */
  var left: integer = js.native
  
  /** This property can be used to read or write the current maximum height of the content or window. A value of null indicates 'unspecified'. */
  var maxHeight: js.UndefOr[integer | Null] = js.native
  
  /** This property can be used to read or write the current maximum width of the content or window. A value of null indicates 'unspecified'. */
  var maxWidth: js.UndefOr[integer | Null] = js.native
  
  /** This property can be used to read or write the current minimum height of the content or window. A value of null indicates 'unspecified'. */
  var minHeight: js.UndefOr[integer | Null] = js.native
  
  /** This property can be used to read or write the current minimum width of the content or window. A value of null indicates 'unspecified'. */
  var minWidth: js.UndefOr[integer | Null] = js.native
  
  /**
    * Set the maximum size constraints of the content or window.
    * The maximum width or height can be set to null to remove the constraint.
    * A value of undefined will leave a constraint unchanged.
    */
  def setMaximumSize(): Unit = js.native
  def setMaximumSize(maxWidth: js.UndefOr[scala.Nothing], maxHeight: integer): Unit = js.native
  def setMaximumSize(maxWidth: Null, maxHeight: integer): Unit = js.native
  def setMaximumSize(maxWidth: integer): Unit = js.native
  def setMaximumSize(maxWidth: integer, maxHeight: integer): Unit = js.native
  
  /** Set the minimum size constraints of the content or window.
    * The minimum width or height can be set to null to remove the constraint.
    * A value of undefined will leave a constraint unchanged.
    **/
  def setMinimumSize(): Unit = js.native
  def setMinimumSize(minWidth: js.UndefOr[scala.Nothing], minHeight: integer): Unit = js.native
  def setMinimumSize(minWidth: Null, minHeight: integer): Unit = js.native
  def setMinimumSize(minWidth: integer): Unit = js.native
  def setMinimumSize(minWidth: integer, minHeight: integer): Unit = js.native
  
  /** Set the left and top position of the content or window. */
  def setPosition(left: integer, top: integer): Unit = js.native
  
  /** Set the width and height of the content or window. */
  def setSize(width: integer, height: integer): Unit = js.native
  
  /** This property can be used to read or write the current Y coordinate of the content or window. */
  var top: integer = js.native
  
  /** This property can be used to read or write the current width of the content or window. */
  var width: integer = js.native
}
