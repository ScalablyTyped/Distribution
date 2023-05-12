package typings.chrome.chrome.contentSettings

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentSetting extends StObject {
  
  /**
    * Clear all content setting rules set by this extension.
    */
  def clear(details: ClearDetails): Unit = js.native
  def clear(details: ClearDetails, callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Gets the current content setting for a given pair of URLs.
    */
  def get(details: GetDetails, callback: js.Function1[/* details */ ReturnedDetails, Unit]): Unit = js.native
  
  def getResourceIdentifiers(callback: js.Function1[/* resourceIdentifiers */ js.UndefOr[js.Array[ResourceIdentifier]], Unit]): Unit = js.native
  
  /**
    * Applies a new content setting rule.
    */
  def set(details: SetDetails): Unit = js.native
  def set(details: SetDetails, callback: js.Function0[Unit]): Unit = js.native
}
