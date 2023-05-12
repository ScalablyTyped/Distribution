package typings.cucumberCucumber.anon

import typings.cucumberCucumber.libApiTypesMod.ISourcesCoordinates
import typings.cucumberCucumber.libLoggerMod.ILogger
import typings.cucumberMessages.distCjsSrcIdGeneratorMod.NewId
import typings.cucumberMessages.mod.Envelope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Coordinates extends StObject {
  
  var coordinates: ISourcesCoordinates
  
  var cwd: String
  
  var featurePaths: js.Array[String]
  
  var logger: ILogger
  
  def newId(): String
  @JSName("newId")
  var newId_Original: NewId
  
  var onEnvelope: js.UndefOr[js.Function1[/* envelope */ Envelope, Unit]] = js.undefined
  
  var unexpandedFeaturePaths: js.Array[String]
}
object Coordinates {
  
  inline def apply(
    coordinates: ISourcesCoordinates,
    cwd: String,
    featurePaths: js.Array[String],
    logger: ILogger,
    newId: () => String,
    unexpandedFeaturePaths: js.Array[String]
  ): Coordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any], cwd = cwd.asInstanceOf[js.Any], featurePaths = featurePaths.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], newId = js.Any.fromFunction0(newId), unexpandedFeaturePaths = unexpandedFeaturePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Coordinates] (val x: Self) extends AnyVal {
    
    inline def setCoordinates(value: ISourcesCoordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setFeaturePaths(value: js.Array[String]): Self = StObject.set(x, "featurePaths", value.asInstanceOf[js.Any])
    
    inline def setFeaturePathsVarargs(value: String*): Self = StObject.set(x, "featurePaths", js.Array(value*))
    
    inline def setLogger(value: ILogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setNewId(value: () => String): Self = StObject.set(x, "newId", js.Any.fromFunction0(value))
    
    inline def setOnEnvelope(value: /* envelope */ Envelope => Unit): Self = StObject.set(x, "onEnvelope", js.Any.fromFunction1(value))
    
    inline def setOnEnvelopeUndefined: Self = StObject.set(x, "onEnvelope", js.undefined)
    
    inline def setUnexpandedFeaturePaths(value: js.Array[String]): Self = StObject.set(x, "unexpandedFeaturePaths", value.asInstanceOf[js.Any])
    
    inline def setUnexpandedFeaturePathsVarargs(value: String*): Self = StObject.set(x, "unexpandedFeaturePaths", js.Array(value*))
  }
}
