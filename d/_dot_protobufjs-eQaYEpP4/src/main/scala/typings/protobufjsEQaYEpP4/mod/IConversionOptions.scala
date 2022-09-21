package typings.protobufjsEQaYEpP4.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IConversionOptions extends StObject {
  
  /** Sets empty arrays for missing repeated fields even if `defaults=false` */
  var arrays: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Bytes value conversion type.
    * Valid values are `Array` and (a base64 encoded) `String` (the global types).
    * Defaults to copy the present value, which usually is a Buffer under node and an Uint8Array in the browser.
    */
  var bytes: js.UndefOr[js.Function] = js.undefined
  
  /** Also sets default values on the resulting object */
  var defaults: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enum value conversion type.
    * Only valid value is `String` (the global type).
    * Defaults to copy the present value, which is the numeric id.
    */
  var enums: js.UndefOr[js.Function] = js.undefined
  
  /** Performs additional JSON compatibility conversions, i.e. NaN and Infinity to strings */
  var json: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Long conversion type.
    * Valid values are `String` and `Number` (the global types).
    * Defaults to copy the present value, which is a possibly unsafe number without and a {@link Long} with a long library.
    */
  var longs: js.UndefOr[js.Function] = js.undefined
  
  /** Sets empty objects for missing map fields even if `defaults=false` */
  var objects: js.UndefOr[Boolean] = js.undefined
  
  /** Includes virtual oneof properties set to the present field's name, if any */
  var oneofs: js.UndefOr[Boolean] = js.undefined
}
object IConversionOptions {
  
  inline def apply(): IConversionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IConversionOptions]
  }
  
  extension [Self <: IConversionOptions](x: Self) {
    
    inline def setArrays(value: Boolean): Self = StObject.set(x, "arrays", value.asInstanceOf[js.Any])
    
    inline def setArraysUndefined: Self = StObject.set(x, "arrays", js.undefined)
    
    inline def setBytes(value: js.Function): Self = StObject.set(x, "bytes", value.asInstanceOf[js.Any])
    
    inline def setBytesUndefined: Self = StObject.set(x, "bytes", js.undefined)
    
    inline def setDefaults(value: Boolean): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setEnums(value: js.Function): Self = StObject.set(x, "enums", value.asInstanceOf[js.Any])
    
    inline def setEnumsUndefined: Self = StObject.set(x, "enums", js.undefined)
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setLongs(value: js.Function): Self = StObject.set(x, "longs", value.asInstanceOf[js.Any])
    
    inline def setLongsUndefined: Self = StObject.set(x, "longs", js.undefined)
    
    inline def setObjects(value: Boolean): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
    
    inline def setObjectsUndefined: Self = StObject.set(x, "objects", js.undefined)
    
    inline def setOneofs(value: Boolean): Self = StObject.set(x, "oneofs", value.asInstanceOf[js.Any])
    
    inline def setOneofsUndefined: Self = StObject.set(x, "oneofs", js.undefined)
  }
}
