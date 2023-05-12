package typings.bson.mod

import typings.bson.anon.Utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeserializeOptions extends StObject {
  
  /**
    * allows the buffer to be larger than the parsed BSON object.
    * @defaultValue `false`
    */
  var allowObjectSmallerThanBufferSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * return BSON regular expressions as BSONRegExp instances.
    * @defaultValue `false`
    */
  var bsonRegExp: js.UndefOr[Boolean] = js.undefined
  
  /**
    * allow to specify if there what fields we wish to return as unserialized raw buffer.
    * @defaultValue `null`
    */
  var fieldsAsRaw: js.UndefOr[Document] = js.undefined
  
  /**
    * Offset into buffer to begin reading document from
    * @defaultValue `0`
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  
  /**
    * when deserializing a Binary will return it as a node.js Buffer instance.
    * @defaultValue `false`
    */
  var promoteBuffers: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when deserializing a Long will fit it into a Number if it's smaller than 53 bits.
    * @defaultValue `true`
    */
  var promoteLongs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when deserializing will promote BSON values to their Node.js closest equivalent types.
    * @defaultValue `true`
    */
  var promoteValues: js.UndefOr[Boolean] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * when deserializing a Long return as a BigInt.
    * @defaultValue `false`
    */
  var useBigInt64: js.UndefOr[Boolean] = js.undefined
  
  /** Allows for opt-out utf-8 validation for all keys or
    * specified keys. Must be all true or all false.
    *
    * @example
    * ```js
    * // disables validation on all keys
    *  validation: { utf8: false }
    *
    * // enables validation only on specified keys a, b, and c
    *  validation: { utf8: { a: true, b: true, c: true } }
    *
    *  // disables validation only on specified keys a, b
    *  validation: { utf8: { a: false, b: false } }
    * ```
    */
  var validation: js.UndefOr[Utf8] = js.undefined
}
object DeserializeOptions {
  
  inline def apply(): DeserializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeserializeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeserializeOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowObjectSmallerThanBufferSize(value: Boolean): Self = StObject.set(x, "allowObjectSmallerThanBufferSize", value.asInstanceOf[js.Any])
    
    inline def setAllowObjectSmallerThanBufferSizeUndefined: Self = StObject.set(x, "allowObjectSmallerThanBufferSize", js.undefined)
    
    inline def setBsonRegExp(value: Boolean): Self = StObject.set(x, "bsonRegExp", value.asInstanceOf[js.Any])
    
    inline def setBsonRegExpUndefined: Self = StObject.set(x, "bsonRegExp", js.undefined)
    
    inline def setFieldsAsRaw(value: Document): Self = StObject.set(x, "fieldsAsRaw", value.asInstanceOf[js.Any])
    
    inline def setFieldsAsRawUndefined: Self = StObject.set(x, "fieldsAsRaw", js.undefined)
    
    inline def setIndex(value: scala.Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPromoteBuffers(value: Boolean): Self = StObject.set(x, "promoteBuffers", value.asInstanceOf[js.Any])
    
    inline def setPromoteBuffersUndefined: Self = StObject.set(x, "promoteBuffers", js.undefined)
    
    inline def setPromoteLongs(value: Boolean): Self = StObject.set(x, "promoteLongs", value.asInstanceOf[js.Any])
    
    inline def setPromoteLongsUndefined: Self = StObject.set(x, "promoteLongs", js.undefined)
    
    inline def setPromoteValues(value: Boolean): Self = StObject.set(x, "promoteValues", value.asInstanceOf[js.Any])
    
    inline def setPromoteValuesUndefined: Self = StObject.set(x, "promoteValues", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setUseBigInt64(value: Boolean): Self = StObject.set(x, "useBigInt64", value.asInstanceOf[js.Any])
    
    inline def setUseBigInt64Undefined: Self = StObject.set(x, "useBigInt64", js.undefined)
    
    inline def setValidation(value: Utf8): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
    
    inline def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
  }
}
