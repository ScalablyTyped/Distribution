package typings.cypress.typesSinonMod

import typings.sinonjsFakeTimers.mod.InstalledMethods
import typings.sinonjsFakeTimers.mod.NodeClock
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SinonFakeTimers
  extends StObject
     with InstalledMethods
     with NodeClock {
  
  /**
    * Restore the faked methods.
    * Call in e.g. tearDown.
    */
  def restore(): Unit = js.native
}
