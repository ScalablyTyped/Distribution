package typings.bytestreamjs

import typings.bytestreamjs.buildTypesBitStreamMod.BitStreamParameters
import typings.bytestreamjs.buildTypesByteStreamMod.ByteStreamParameters
import typings.bytestreamjs.buildTypesHelpersMod.ByteMap
import typings.bytestreamjs.buildTypesSeqBitStreamMod.SeqBitStreamParameters
import typings.bytestreamjs.buildTypesSeqStreamMod.SeqStreamParameters
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bytestreamjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bytestreamjs", "BitStream")
  @js.native
  /**
    * Constructor for "BitStream" class
    * @param parameters
    */
  open class BitStream ()
    extends typings.bytestreamjs.buildTypesBitStreamMod.BitStream {
    def this(parameters: BitStreamParameters) = this()
  }
  
  @JSImport("bytestreamjs", "ByteStream")
  @js.native
  /**
    * Constructor for ByteStream class
    * @param parameters
    */
  open class ByteStream ()
    extends typings.bytestreamjs.buildTypesByteStreamMod.ByteStream {
    def this(parameters: ByteStreamParameters) = this()
  }
  
  @JSImport("bytestreamjs", "SeqBitStream")
  @js.native
  open class SeqBitStream ()
    extends typings.bytestreamjs.buildTypesSeqBitStreamMod.SeqBitStream {
    def this(parameters: SeqBitStreamParameters) = this()
  }
  
  @JSImport("bytestreamjs", "SeqStream")
  @js.native
  /**
    * Constructor for "SeqStream" class
    * @param parameters
    */
  open class SeqStream ()
    extends typings.bytestreamjs.buildTypesSeqStreamMod.SeqStream {
    def this(parameters: SeqStreamParameters) = this()
  }
  /* static members */
  object SeqStream {
    
    @JSImport("bytestreamjs", "SeqStream")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("bytestreamjs", "SeqStream.APPEND_BLOCK")
    @js.native
    def APPEND_BLOCK: Double = js.native
    inline def APPEND_BLOCK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("APPEND_BLOCK")(x.asInstanceOf[js.Any])
  }
  
  inline def parseByteMap(
    stream: typings.bytestreamjs.buildTypesByteStreamMod.ByteStream,
    map: js.Array[ByteMap],
    elements: Double
  ): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteMap")(stream.asInstanceOf[js.Any], map.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def parseByteMap(
    stream: typings.bytestreamjs.buildTypesByteStreamMod.ByteStream,
    map: js.Array[ByteMap],
    elements: Double,
    start: Double
  ): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteMap")(stream.asInstanceOf[js.Any], map.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def parseByteMap(
    stream: typings.bytestreamjs.buildTypesByteStreamMod.ByteStream,
    map: js.Array[ByteMap],
    elements: Double,
    start: Double,
    length: Double
  ): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteMap")(stream.asInstanceOf[js.Any], map.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def parseByteMap(
    stream: typings.bytestreamjs.buildTypesByteStreamMod.ByteStream,
    map: js.Array[ByteMap],
    elements: Double,
    start: Null,
    length: Double
  ): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteMap")(stream.asInstanceOf[js.Any], map.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
  inline def parseByteMap(
    stream: typings.bytestreamjs.buildTypesByteStreamMod.ByteStream,
    map: js.Array[ByteMap],
    elements: Double,
    start: Unit,
    length: Double
  ): js.Array[Record[String, Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseByteMap")(stream.asInstanceOf[js.Any], map.asInstanceOf[js.Any], elements.asInstanceOf[js.Any], start.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[Record[String, Any]]]
}
