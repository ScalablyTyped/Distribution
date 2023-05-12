package typings.datastorePubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("datastore-pubsub/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def encodeBase32(buf: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeBase32")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def keyToTopic(key: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyToTopic")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def keyToTopic(key: js.typedarray.Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("keyToTopic")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def topicToKey(topic: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("topicToKey")(topic.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
}
