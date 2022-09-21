package typings.cbor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleMod {
  
  /**
    * A CBOR Simple Value that does not map onto a known constant.
    */
  @JSImport("cbor/types/lib/simple", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Simple {
    /**
      * Creates an instance of Simple.
      *
      * @param {number} value The simple value's integer value.
      */
    def this(value: Double) = this()
    
    /**
      * Push the simple value onto the CBOR stream.
      *
      * @param {object} gen The generator to push onto.
      * @returns {boolean} True on success.
      */
    /* CompleteClass */
    override def encodeCBOR(gen: js.Object): Boolean = js.native
    
    /* CompleteClass */
    var value: Double = js.native
  }
  @JSImport("cbor/types/lib/simple", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Decode from the CBOR additional information into a JavaScript value.
    * If the CBOR item has no parent, return a "safe" symbol instead of
    * `null` or `undefined`, so that the value can be passed through a
    * stream in object mode.
    *
    * @param {number} val The CBOR additional info to convert.
    * @param {boolean} [has_parent=true] Does the CBOR item have a parent?
    * @param {boolean} [parent_indefinite=false] Is the parent element
    *   indefinitely encoded?
    * @returns {(null|undefined|boolean|symbol|Simple)} The decoded value.
    * @throws {Error} Invalid BREAK.
    */
  /* static member */
  inline def decode(`val`: Double): js.UndefOr[Null | Boolean | js.Symbol | Simple] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(`val`.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Null | Boolean | js.Symbol | Simple]]
  inline def decode(`val`: Double, has_parent: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(`val`.asInstanceOf[js.Any], has_parent.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Null | Boolean | js.Symbol | Simple]]
  inline def decode(`val`: Double, has_parent: Boolean, parent_indefinite: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(`val`.asInstanceOf[js.Any], has_parent.asInstanceOf[js.Any], parent_indefinite.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Null | Boolean | js.Symbol | Simple]]
  inline def decode(`val`: Double, has_parent: Unit, parent_indefinite: Boolean): js.UndefOr[Null | Boolean | js.Symbol | Simple] = (^.asInstanceOf[js.Dynamic].applyDynamic("decode")(`val`.asInstanceOf[js.Any], has_parent.asInstanceOf[js.Any], parent_indefinite.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Null | Boolean | js.Symbol | Simple]]
  
  /**
    * Is the given object a Simple?
    *
    * @param {any} obj Object to test.
    * @returns {boolean} Is it Simple?
    */
  /* static member */
  inline def isSimple(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSimple")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * A CBOR Simple Value that does not map onto a known constant.
    */
  trait Simple extends StObject {
    
    /**
      * Push the simple value onto the CBOR stream.
      *
      * @param {object} gen The generator to push onto.
      * @returns {boolean} True on success.
      */
    def encodeCBOR(gen: js.Object): Boolean
    
    var value: Double
  }
  object Simple {
    
    inline def apply(encodeCBOR: js.Object => Boolean, value: Double): Simple = {
      val __obj = js.Dynamic.literal(encodeCBOR = js.Any.fromFunction1(encodeCBOR), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Simple]
    }
    
    extension [Self <: Simple](x: Self) {
      
      inline def setEncodeCBOR(value: js.Object => Boolean): Self = StObject.set(x, "encodeCBOR", js.Any.fromFunction1(value))
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
