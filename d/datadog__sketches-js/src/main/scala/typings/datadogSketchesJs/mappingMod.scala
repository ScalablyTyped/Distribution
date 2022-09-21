package typings.datadogSketchesJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mappingMod {
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping", "CubicallyInterpolatedMapping")
  @js.native
  open class CubicallyInterpolatedMapping protected ()
    extends typings.datadogSketchesJs.cubicallyInterpolatedMappingMod.CubicallyInterpolatedMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping", "KeyMapping")
  @js.native
  open class KeyMapping protected ()
    extends typings.datadogSketchesJs.keyMappingMod.KeyMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
  }
  /* static members */
  object KeyMapping {
    
    @JSImport("@datadog/sketches-js/dist/ddsketch/mapping", "KeyMapping")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromGammaOffset(gamma: Double, indexOffset: Double): typings.datadogSketchesJs.keyMappingMod.KeyMapping = (^.asInstanceOf[js.Dynamic].applyDynamic("fromGammaOffset")(gamma.asInstanceOf[js.Any], indexOffset.asInstanceOf[js.Any])).asInstanceOf[typings.datadogSketchesJs.keyMappingMod.KeyMapping]
    
    inline def fromProto(): typings.datadogSketchesJs.keyMappingMod.KeyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProto")().asInstanceOf[typings.datadogSketchesJs.keyMappingMod.KeyMapping]
    inline def fromProto(
      protoMapping: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IIndexMapping */ Any
    ): typings.datadogSketchesJs.keyMappingMod.KeyMapping = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProto")(protoMapping.asInstanceOf[js.Any]).asInstanceOf[typings.datadogSketchesJs.keyMappingMod.KeyMapping]
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping", "LinearlyInterpolatedMapping")
  @js.native
  open class LinearlyInterpolatedMapping protected ()
    extends typings.datadogSketchesJs.linearlyInterpolatedMappingMod.LinearlyInterpolatedMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
  }
  
  @JSImport("@datadog/sketches-js/dist/ddsketch/mapping", "LogarithmicMapping")
  @js.native
  open class LogarithmicMapping protected ()
    extends typings.datadogSketchesJs.logarithmicMappingMod.LogarithmicMapping {
    def this(relativeAccuracy: Double) = this()
    def this(relativeAccuracy: Double, offset: Double) = this()
  }
}
