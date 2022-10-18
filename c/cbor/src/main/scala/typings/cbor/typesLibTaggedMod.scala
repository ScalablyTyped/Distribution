package typings.cbor

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLibTaggedMod {
  
  /**
    * A CBOR tagged item, where the tag does not have semantics specified at the
    * moment, or those semantics threw an error during parsing. Typically this will
    * be an extension point you're not yet expecting.
    */
  @JSImport("cbor/types/lib/tagged", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Tagged {
    /**
      * Creates an instance of Tagged.
      *
      * @param {number} tag The number of the tag.
      * @param {any} value The value inside the tag.
      * @param {Error} [err] The error that was thrown parsing the tag, or null.
      */
    def this(tag: Double, value: Any) = this()
    def this(tag: Double, value: Any, err: js.Error) = this()
    
    /**
      * If we have a converter for this type, do the conversion.  Some converters
      * are built-in.  Additional ones can be passed in.  If you want to remove
      * a built-in converter, pass a converter in whose value is 'null' instead
      * of a function.
      *
      * @param {object} converters Keys in the object are a tag number, the value
      *   is a function that takes the decoded CBOR and returns a JavaScript value
      *   of the appropriate type.  Throw an exception in the function on errors.
      * @returns {any} The converted item.
      */
    /* CompleteClass */
    override def convert(converters: js.Object): Any = js.native
    
    /**
      * Push the simple value onto the CBOR stream.
      *
      * @param {object} gen The generator to push onto.
      * @returns {boolean} True on success.
      */
    /* CompleteClass */
    override def encodeCBOR(gen: js.Object): Boolean = js.native
    
    /* CompleteClass */
    var err: js.Error = js.native
    
    /* CompleteClass */
    var tag: Double = js.native
    
    /* CompleteClass */
    override def toJSON(): Any = js.native
    
    /* CompleteClass */
    var value: Any = js.native
  }
  @JSImport("cbor/types/lib/tagged", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cbor/types/lib/tagged", "INTERNAL_JSON")
  @js.native
  val INTERNAL_JSON: js.Symbol = js.native
  
  /**
    * Reset the supported tags to the original set, before any plugins modified
    * the list.
    */
  /* static member */
  inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
  
  /**
    * Convert a tagged value to a more interesting JavaScript type.  Errors
    * thrown in this function will be captured into the "err" property of the
    * original Tagged instance.
    */
  type TagFunction = js.Function2[/* value */ Any, /* tag */ Tagged, Any]
  
  /**
    * A mapping from tag number to a tag decoding function.
    */
  type TagMap = StringDictionary[TagFunction]
  
  /**
    * A CBOR tagged item, where the tag does not have semantics specified at the
    * moment, or those semantics threw an error during parsing. Typically this will
    * be an extension point you're not yet expecting.
    */
  trait Tagged extends StObject {
    
    /**
      * If we have a converter for this type, do the conversion.  Some converters
      * are built-in.  Additional ones can be passed in.  If you want to remove
      * a built-in converter, pass a converter in whose value is 'null' instead
      * of a function.
      *
      * @param {object} converters Keys in the object are a tag number, the value
      *   is a function that takes the decoded CBOR and returns a JavaScript value
      *   of the appropriate type.  Throw an exception in the function on errors.
      * @returns {any} The converted item.
      */
    def convert(converters: js.Object): Any
    
    /**
      * Push the simple value onto the CBOR stream.
      *
      * @param {object} gen The generator to push onto.
      * @returns {boolean} True on success.
      */
    def encodeCBOR(gen: js.Object): Boolean
    
    var err: js.Error
    
    var tag: Double
    
    def toJSON(): Any
    
    var value: Any
  }
  object Tagged {
    
    inline def apply(
      convert: js.Object => Any,
      encodeCBOR: js.Object => Boolean,
      err: js.Error,
      tag: Double,
      toJSON: () => Any,
      value: Any
    ): Tagged = {
      val __obj = js.Dynamic.literal(convert = js.Any.fromFunction1(convert), encodeCBOR = js.Any.fromFunction1(encodeCBOR), err = err.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tagged]
    }
    
    extension [Self <: Tagged](x: Self) {
      
      inline def setConvert(value: js.Object => Any): Self = StObject.set(x, "convert", js.Any.fromFunction1(value))
      
      inline def setEncodeCBOR(value: js.Object => Boolean): Self = StObject.set(x, "encodeCBOR", js.Any.fromFunction1(value))
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Double): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
