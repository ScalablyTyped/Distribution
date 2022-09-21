package typings.cesium.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Credit")
@js.native
open class Credit protected () extends StObject {
  def this(html: String) = this()
  def this(html: String, showOnScreen: Boolean) = this()
  
  /**
    * Gets the credit element
    */
  val element: HTMLElement = js.native
  
  /**
    * Returns true if the credits are equal
    * @param credit - The credit to compare to.
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  def equals(credit: Credit): Boolean = js.native
  
  /**
    * The credit content
    */
  val html: String = js.native
  
  /**
    * Whether the credit should be displayed on screen or in a lightbox
    */
  var showOnScreen: Boolean = js.native
}
/* static members */
object Credit {
  
  @JSImport("cesium", "Credit")
  @js.native
  val ^ : js.Any = js.native
  
  inline def clone(credit: Credit): Credit = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(credit.asInstanceOf[js.Any]).asInstanceOf[Credit]
  
  /**
    * Returns true if the credits are equal
    * @param left - The first credit
    * @param right - The second credit
    * @returns <code>true</code> if left and right are equal, <code>false</code> otherwise.
    */
  inline def equals(left: Credit, right: Credit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
