package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This EncryptedMediaExtensions API interface provides access to a Key System for decryption and/or a content protection provider. You can request an instance of this object using the Navigator.requestMediaKeySystemAccess method.
  * Available only in secure contexts.
  */
trait MediaKeySystemAccess extends StObject {
  
  def createMediaKeys(): Promise[MediaKeys]
  
  def getConfiguration(): MediaKeySystemConfiguration
  
  val keySystem: java.lang.String
}
object MediaKeySystemAccess {
  
  inline def apply(
    createMediaKeys: () => Promise[MediaKeys],
    getConfiguration: () => MediaKeySystemConfiguration,
    keySystem: java.lang.String
  ): MediaKeySystemAccess = {
    val __obj = js.Dynamic.literal(createMediaKeys = js.Any.fromFunction0(createMediaKeys), getConfiguration = js.Any.fromFunction0(getConfiguration), keySystem = keySystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaKeySystemAccess]
  }
  
  extension [Self <: MediaKeySystemAccess](x: Self) {
    
    inline def setCreateMediaKeys(value: () => Promise[MediaKeys]): Self = StObject.set(x, "createMediaKeys", js.Any.fromFunction0(value))
    
    inline def setGetConfiguration(value: () => MediaKeySystemConfiguration): Self = StObject.set(x, "getConfiguration", js.Any.fromFunction0(value))
    
    inline def setKeySystem(value: java.lang.String): Self = StObject.set(x, "keySystem", value.asInstanceOf[js.Any])
  }
}
