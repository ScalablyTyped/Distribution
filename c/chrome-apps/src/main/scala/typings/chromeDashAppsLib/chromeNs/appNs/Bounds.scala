package typings
package chromeDashAppsLib.chromeNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds extends js.Object {
  /** This property can be used to read or write the current height of the content or window. */
  var height: chromeDashAppsLib.chromeNs.integer = js.native
  /** This property can be used to read or write the current X coordinate of the content or window. */
  var left: chromeDashAppsLib.chromeNs.integer = js.native
  /** This property can be used to read or write the current maximum height of the content or window. A value of null indicates 'unspecified'. */
  var maxHeight: js.UndefOr[chromeDashAppsLib.chromeNs.integer | scala.Null] = js.native
  /** This property can be used to read or write the current maximum width of the content or window. A value of null indicates 'unspecified'. */
  var maxWidth: js.UndefOr[chromeDashAppsLib.chromeNs.integer | scala.Null] = js.native
  /** This property can be used to read or write the current minimum height of the content or window. A value of null indicates 'unspecified'. */
  var minHeight: js.UndefOr[chromeDashAppsLib.chromeNs.integer | scala.Null] = js.native
  /** This property can be used to read or write the current minimum width of the content or window. A value of null indicates 'unspecified'. */
  var minWidth: js.UndefOr[chromeDashAppsLib.chromeNs.integer | scala.Null] = js.native
  /** This property can be used to read or write the current Y coordinate of the content or window. */
  var top: chromeDashAppsLib.chromeNs.integer = js.native
  /** This property can be used to read or write the current width of the content or window. */
  var width: chromeDashAppsLib.chromeNs.integer = js.native
  /**
               * Set the maximum size constraints of the content or window.
               * The maximum width or height can be set to null to remove the constraint.
               * A value of undefined will leave a constraint unchanged.
               */
  def setMaximumSize(): scala.Unit = js.native
  /**
               * Set the maximum size constraints of the content or window.
               * The maximum width or height can be set to null to remove the constraint.
               * A value of undefined will leave a constraint unchanged.
               */
  def setMaximumSize(maxWidth: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /**
               * Set the maximum size constraints of the content or window.
               * The maximum width or height can be set to null to remove the constraint.
               * A value of undefined will leave a constraint unchanged.
               */
  def setMaximumSize(maxWidth: chromeDashAppsLib.chromeNs.integer, maxHeight: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /**
               * Set the maximum size constraints of the content or window.
               * The maximum width or height can be set to null to remove the constraint.
               * A value of undefined will leave a constraint unchanged.
               */
  def setMaximumSize(maxWidth: js.UndefOr[scala.Nothing], maxHeight: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /**
               * Set the maximum size constraints of the content or window.
               * The maximum width or height can be set to null to remove the constraint.
               * A value of undefined will leave a constraint unchanged.
               */
  def setMaximumSize(maxWidth: scala.Null, maxHeight: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /** Set the minimum size constraints of the content or window.
               * The minimum width or height can be set to null to remove the constraint.
               * A value of undefined will leave a constraint unchanged.
               **/
  def setMinimumSize(): scala.Unit = js.native
  /** Set the minimum size constraints of the content or window.
               * The minimum width or height can be set to null to remove the constraint.
               * A value of undefined will leave a constraint unchanged.
               **/
  def setMinimumSize(minWidth: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /** Set the minimum size constraints of the content or window.
               * The minimum width or height can be set to null to remove the constraint.
               * A value of undefined will leave a constraint unchanged.
               **/
  def setMinimumSize(minWidth: chromeDashAppsLib.chromeNs.integer, minHeight: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /** Set the minimum size constraints of the content or window.
               * The minimum width or height can be set to null to remove the constraint.
               * A value of undefined will leave a constraint unchanged.
               **/
  def setMinimumSize(minWidth: js.UndefOr[scala.Nothing], minHeight: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /** Set the minimum size constraints of the content or window.
               * The minimum width or height can be set to null to remove the constraint.
               * A value of undefined will leave a constraint unchanged.
               **/
  def setMinimumSize(minWidth: scala.Null, minHeight: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /** Set the left and top position of the content or window. */
  def setPosition(left: chromeDashAppsLib.chromeNs.integer, top: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
  /** Set the width and height of the content or window. */
  def setSize(width: chromeDashAppsLib.chromeNs.integer, height: chromeDashAppsLib.chromeNs.integer): scala.Unit = js.native
}

