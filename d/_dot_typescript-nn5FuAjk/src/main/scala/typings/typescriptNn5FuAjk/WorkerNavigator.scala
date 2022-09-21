package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A subset of the Navigator interface allowed to be accessed from a Worker. Such an object is initialized for each worker and is available via the WorkerGlobalScope.navigator property obtained by calling window.self.navigator. */
trait WorkerNavigator
  extends StObject
     with NavigatorConcurrentHardware
     with NavigatorID
     with NavigatorLanguage
     with NavigatorLocks
     with NavigatorNetworkInformation
     with NavigatorOnLine
     with NavigatorStorage {
  
  val mediaCapabilities: MediaCapabilities
}
object WorkerNavigator {
  
  inline def apply(
    appCodeName: java.lang.String,
    appName: java.lang.String,
    appVersion: java.lang.String,
    connection: NetworkInformation,
    hardwareConcurrency: Double,
    language: java.lang.String,
    languages: ReadonlyArray[java.lang.String],
    locks: LockManager,
    mediaCapabilities: MediaCapabilities,
    onLine: scala.Boolean,
    platform: java.lang.String,
    product: java.lang.String,
    productSub: java.lang.String,
    storage: StorageManager,
    userAgent: java.lang.String,
    vendor: java.lang.String,
    vendorSub: java.lang.String
  ): WorkerNavigator = {
    val __obj = js.Dynamic.literal(appCodeName = appCodeName.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], appVersion = appVersion.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any], hardwareConcurrency = hardwareConcurrency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], locks = locks.asInstanceOf[js.Any], mediaCapabilities = mediaCapabilities.asInstanceOf[js.Any], onLine = onLine.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], product = product.asInstanceOf[js.Any], productSub = productSub.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], userAgent = userAgent.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], vendorSub = vendorSub.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerNavigator]
  }
  
  extension [Self <: WorkerNavigator](x: Self) {
    
    inline def setMediaCapabilities(value: MediaCapabilities): Self = StObject.set(x, "mediaCapabilities", value.asInstanceOf[js.Any])
  }
}
