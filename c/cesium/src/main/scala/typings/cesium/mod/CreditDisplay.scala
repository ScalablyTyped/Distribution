package typings.cesium.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "CreditDisplay")
@js.native
open class CreditDisplay protected () extends StObject {
  def this(container: HTMLElement) = this()
  def this(container: HTMLElement, delimiter: String) = this()
  def this(container: HTMLElement, delimiter: String, viewport: HTMLElement) = this()
  def this(container: HTMLElement, delimiter: Unit, viewport: HTMLElement) = this()
  
  /**
    * Adds a credit to the list of current credits to be displayed in the credit container
    * for the next frame
    * @param credit - The credit to display
    */
  def addCredit(credit: Credit): Unit = js.native
  
  /**
    * Adds a {@link Credit} that will show on screen or in the lightbox until
    * the next frame. This is mostly for internal use. Use {@link CreditDisplay.addStaticCredit} to add a persistent credit to the screen.
    * @param credit - The credit to display in the next frame.
    */
  def addCreditToNextFrame(credit: Credit): Unit = js.native
  
  /**
    * Adds credits that will persist until they are removed
    * @param credit - The credit to added to defaults
    */
  def addDefaultCredit(credit: Credit): Unit = js.native
  
  /**
    * Adds a {@link Credit} that will show on screen or in the lightbox until removed with {@link CreditDisplay.removeStaticCredit}.
    * @example
    * // Add a credit with a tooltip, image and link to display onscreen
    * const credit = new Cesium.Credit(`<a href="https://cesium.com/" target="_blank"><img src="/images/cesium_logo.png" title="Cesium"/></a>`, true);
    * viewer.creditDisplay.addStaticCredit(credit);
    * @example
    * // Add a credit with a plaintext link to display in the lightbox
    * const credit = new Cesium.Credit('<a href="https://cesium.com/" target="_blank">Cesium</a>');
    * viewer.creditDisplay.addStaticCredit(credit);
    * @param credit - The credit to added
    */
  def addStaticCredit(credit: Credit): Unit = js.native
  
  /**
    * Resets the credit display to a beginning of frame state, clearing out current credits.
    */
  def beginFrame(): Unit = js.native
  
  /**
    * The HTML element where credits will be displayed.
    */
  var container: HTMLElement = js.native
  
  /**
    * Destroys the resources held by this object.  Destroying an object allows for deterministic
    * release of resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    */
  def destroy(): Unit = js.native
  
  /**
    * Sets the credit display to the end of frame state, displaying credits from the last frame in the credit container.
    */
  def endFrame(): Unit = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Removes a default credit.
    * @param credit - The credit to be removed from defaults
    */
  def removeDefaultCredit(credit: Credit): Unit = js.native
  
  /**
    * Removes a static credit shown on screen or in the lightbox.
    * @param credit - The credit to be removed.
    */
  def removeStaticCredit(credit: Credit): Unit = js.native
  
  /**
    * Updates the credit display before a new frame is rendered.
    */
  def update(): Unit = js.native
}
/* static members */
object CreditDisplay {
  
  @JSImport("cesium", "CreditDisplay")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets the Cesium logo credit.
    */
  @JSImport("cesium", "CreditDisplay.cesiumCredit")
  @js.native
  def cesiumCredit: Credit = js.native
  inline def cesiumCredit_=(x: Credit): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cesiumCredit")(x.asInstanceOf[js.Any])
}
