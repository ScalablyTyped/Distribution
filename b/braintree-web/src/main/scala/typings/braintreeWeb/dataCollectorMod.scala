package typings.braintreeWeb

import typings.braintreeWeb.anon.Kount
import typings.braintreeWeb.anon.Raw
import typings.braintreeWeb.coreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataCollectorMod {
  
  @js.native
  trait DataCollector extends StObject {
    
    var VERSION: String = js.native
    
    def create(options: Kount): js.Promise[DataCollector] = js.native
    def create(options: Kount, callback: callback[DataCollector]): Unit = js.native
    
    var deviceData: String = js.native
    
    def getDeviceData(): js.Promise[String | js.Object] = js.native
    def getDeviceData(options: Raw): js.Promise[String | js.Object] = js.native
    def getDeviceData(options: Raw, callback: callback[Unit]): Unit = js.native
    
    var rawDeviceData: js.Object = js.native
    
    def teardown(): js.Promise[Unit] = js.native
    def teardown(callback: callback[Any]): Unit = js.native
  }
}
