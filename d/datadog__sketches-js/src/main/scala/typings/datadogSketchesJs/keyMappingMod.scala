package typings.datadogSketchesJs

import typings.datadogSketchesJs.typesMod.Mapping
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyMappingMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping/KeyMapping", "KeyMapping")
  @js.native
  open class KeyMapping protected ()
    extends StObject
       with Mapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
    
    /** Return (an approximation of) the logarithm of the value base gamma */
    def _logGamma(value: Double): Double = js.native
    
    /** Used for calculating _logGamma(value). Initially, _multiplier = 1 / log(gamma) */
    var _multiplier: Double = js.native
    
    /** An offset that can be used for shifting all keys */
    var _offset: Double = js.native
    
    /** Return (an approximation of) gamma to the power value */
    def _powGamma(value: Double): Double = js.native
    
    def _protoInterpolation(): Any = js.native
    
    /* CompleteClass */
    var gamma: Double = js.native
    
    /* CompleteClass */
    override def key(value: Double): Double = js.native
    
    /* CompleteClass */
    var maxPossible: Double = js.native
    
    /* CompleteClass */
    var minPossible: Double = js.native
    
    /* CompleteClass */
    var relativeAccuracy: Double = js.native
    
    /* CompleteClass */
    override def toProto(): Any = js.native
    
    /* CompleteClass */
    override def value(key: Double): Double = js.native
  }
  /* static members */
  object KeyMapping {
    
    @JSImport("@datadog/sketches-js/dist/ddsketch/mapping/KeyMapping", "KeyMapping")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromGammaOffset(gamma: Double, indexOffset: Double): KeyMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGammaOffset")(gamma.asInstanceOf[js.Any], indexOffset.asInstanceOf[js.Any])).asInstanceOf[KeyMapping]
    
    inline def fromProto(): KeyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProto")().asInstanceOf[KeyMapping]
    inline def fromProto(
      protoMapping: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IIndexMapping */ Any
    ): KeyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProto")(protoMapping.asInstanceOf[js.Any]).asInstanceOf[KeyMapping]
  }
}
