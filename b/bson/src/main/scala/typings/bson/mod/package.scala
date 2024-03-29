package typings.bson.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import typings.bson.anon.PinExcludekeyofLongTimest
import typings.bson.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def calculateObjectSize(`object`: Document): scala.Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculateObjectSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[scala.Double]
inline def calculateObjectSize(`object`: Document, options: CalculateObjectSizeOptions): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("calculateObjectSize")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def deserialize(buffer: js.typedarray.Uint8Array): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any]).asInstanceOf[Document]
inline def deserialize(buffer: js.typedarray.Uint8Array, options: DeserializeOptions): Document = (^.asInstanceOf[js.Dynamic].applyDynamic("deserialize")(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]

inline def deserializeStream(
  data: js.typedarray.ArrayBuffer,
  startIndex: scala.Double,
  numberOfDocuments: scala.Double,
  documents: js.Array[Document],
  docStartIndex: scala.Double,
  options: DeserializeOptions
): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeStream")(data.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], numberOfDocuments.asInstanceOf[js.Any], documents.asInstanceOf[js.Any], docStartIndex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def deserializeStream(
  data: js.typedarray.Uint8Array,
  startIndex: scala.Double,
  numberOfDocuments: scala.Double,
  documents: js.Array[Document],
  docStartIndex: scala.Double,
  options: DeserializeOptions
): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("deserializeStream")(data.asInstanceOf[js.Any], startIndex.asInstanceOf[js.Any], numberOfDocuments.asInstanceOf[js.Any], documents.asInstanceOf[js.Any], docStartIndex.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def serialize(`object`: Document): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
inline def serialize(`object`: Document, options: SerializeOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(`object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]

inline def serializeWithBufferAndIndex(`object`: Document, finalBuffer: js.typedarray.Uint8Array): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeWithBufferAndIndex")(`object`.asInstanceOf[js.Any], finalBuffer.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def serializeWithBufferAndIndex(`object`: Document, finalBuffer: js.typedarray.Uint8Array, options: SerializeOptions): scala.Double = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeWithBufferAndIndex")(`object`.asInstanceOf[js.Any], finalBuffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

inline def setInternalBufferSize(size: scala.Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInternalBufferSize")(size.asInstanceOf[js.Any]).asInstanceOf[Unit]

type BinarySequence = js.typedarray.Uint8Array | js.Array[scala.Double]

type Document = StringDictionary[Any]

type LongWithoutOverrides = Instantiable3[
/* low */ Any, 
/* high */ js.UndefOr[scala.Double | Boolean], 
/* unsigned */ js.UndefOr[Boolean], 
PinExcludekeyofLongTimest]
