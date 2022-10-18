package typings.chainsafeLibp2pGossipsub.distSrcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataTransform extends StObject {
  
  /**
    * Takes the data published by peers on a topic and transforms the data.
    * Should be the reverse of outboundTransform(). Example:
    * - `inboundTransform()`: decompress snappy payload
    * - `outboundTransform()`: compress snappy payload
    */
  def inboundTransform(topic: TopicStr, data: js.typedarray.Uint8Array): js.typedarray.Uint8Array
  
  /**
    * Takes the data to be published (a topic and associated data) transforms the data. The
    * transformed data will then be used to create a `RawGossipsubMessage` to be sent to peers.
    */
  def outboundTransform(topic: TopicStr, data: js.typedarray.Uint8Array): js.typedarray.Uint8Array
}
object DataTransform {
  
  inline def apply(
    inboundTransform: (TopicStr, js.typedarray.Uint8Array) => js.typedarray.Uint8Array,
    outboundTransform: (TopicStr, js.typedarray.Uint8Array) => js.typedarray.Uint8Array
  ): DataTransform = {
    val __obj = js.Dynamic.literal(inboundTransform = js.Any.fromFunction2(inboundTransform), outboundTransform = js.Any.fromFunction2(outboundTransform))
    __obj.asInstanceOf[DataTransform]
  }
  
  extension [Self <: DataTransform](x: Self) {
    
    inline def setInboundTransform(value: (TopicStr, js.typedarray.Uint8Array) => js.typedarray.Uint8Array): Self = StObject.set(x, "inboundTransform", js.Any.fromFunction2(value))
    
    inline def setOutboundTransform(value: (TopicStr, js.typedarray.Uint8Array) => js.typedarray.Uint8Array): Self = StObject.set(x, "outboundTransform", js.Any.fromFunction2(value))
  }
}
