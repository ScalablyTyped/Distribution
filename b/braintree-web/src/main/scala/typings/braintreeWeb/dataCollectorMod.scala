package typings.braintreeWeb

import typings.braintreeWeb.anon.Kount
import typings.braintreeWeb.coreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataCollectorMod {
  
  @js.native
  trait DataCollector extends StObject {
    
    var VERSION: String = js.native
    
    def create(options: Kount): js.Promise[DataCollector] = js.native
    def create(options: Kount, callback: callback[_]): Unit = js.native
    
    var deviceData: String = js.native
    
    def teardown(): Unit = js.native
    def teardown(callback: callback[_]): Unit = js.native
  }
}
