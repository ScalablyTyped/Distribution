package typings.cbor

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  /**
    * Wrapper around a JavaScript Map object that allows the keys to be
    * any complex type.  The base Map object allows this, but will only
    * compare the keys by identity, not by value.  CborMap translates keys
    * to CBOR first (and base64's them to ensure by-value comparison).
    *
    * This is not a subclass of Object, because it would be tough to get
    * the semantics to be an exact match.
    *
    * @extends Map
    */
  @JSImport("cbor/types/lib/map", JSImport.Namespace)
  @js.native
  /**
    * Creates an instance of CborMap.
    *
    * @param {Iterable<any>} [iterable] An Array or other iterable
    *   object whose elements are key-value pairs (arrays with two elements, e.g.
    *   <code>[[ 1, 'one' ],[ 2, 'two' ]]</code>). Each key-value pair is added
    *   to the new CborMap; null values are treated as undefined.
    */
  open class ^ ()
    extends StObject
       with CborMap {
    def this(iterable: js.Iterable[Any]) = this()
  }
  @JSImport("cbor/types/lib/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @ignore
    */
  /* static member */
  inline def decode(key: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("_decode")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  /**
    * @ignore
    */
  /* static member */
  inline def encode(key: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("_encode")(key.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Wrapper around a JavaScript Map object that allows the keys to be
    * any complex type.  The base Map object allows this, but will only
    * compare the keys by identity, not by value.  CborMap translates keys
    * to CBOR first (and base64's them to ensure by-value comparison).
    *
    * This is not a subclass of Object, because it would be tough to get
    * the semantics to be an exact match.
    *
    * @extends Map
    */
  @js.native
  trait CborMap
    extends StObject
       with Map[Any, Any] {
    
    /**
      * Push the simple value onto the CBOR stream.
      *
      * @param {object} gen The generator to push onto.
      * @returns {boolean} True on success.
      */
    def encodeCBOR(gen: js.Object): Boolean = js.native
  }
}
