package typings.datadogSketchesJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDdsketchMappingMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping", "CubicallyInterpolatedMapping")
  @js.native
  open class CubicallyInterpolatedMapping protected ()
    extends typings.datadogSketchesJs.distDdsketchMappingCubicallyInterpolatedMappingMod.CubicallyInterpolatedMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping", "KeyMapping")
  @js.native
  open class KeyMapping protected ()
    extends typings.datadogSketchesJs.distDdsketchMappingKeyMappingMod.KeyMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
  }
  /* static members */
  object KeyMapping {
    
    @JSImport("@datadog/sketches-js/dist/ddsketch/mapping", "KeyMapping")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromGammaOffset(gamma: Double, indexOffset: Double): typings.datadogSketchesJs.distDdsketchMappingKeyMappingMod.KeyMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGammaOffset")(gamma.asInstanceOf[js.Any], indexOffset.asInstanceOf[js.Any])).asInstanceOf[typings.datadogSketchesJs.distDdsketchMappingKeyMappingMod.KeyMapping]
    
    inline def fromProto(): typings.datadogSketchesJs.distDdsketchMappingKeyMappingMod.KeyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProto")().asInstanceOf[typings.datadogSketchesJs.distDdsketchMappingKeyMappingMod.KeyMapping]
    inline def fromProto(
      protoMapping: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IIndexMapping */ Any
    ): typings.datadogSketchesJs.distDdsketchMappingKeyMappingMod.KeyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProto")(protoMapping.asInstanceOf[js.Any]).asInstanceOf[typings.datadogSketchesJs.distDdsketchMappingKeyMappingMod.KeyMapping]
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping", "LinearlyInterpolatedMapping")
  @js.native
  open class LinearlyInterpolatedMapping protected ()
    extends typings.datadogSketchesJs.distDdsketchMappingLinearlyInterpolatedMappingMod.LinearlyInterpolatedMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping", "LogarithmicMapping")
  @js.native
  open class LogarithmicMapping protected ()
    extends typings.datadogSketchesJs.distDdsketchMappingLogarithmicMappingMod.LogarithmicMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
  }
}
