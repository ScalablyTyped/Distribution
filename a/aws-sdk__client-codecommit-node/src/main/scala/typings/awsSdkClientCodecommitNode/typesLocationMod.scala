package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AFTER
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BEFORE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLocationMod {
  
  trait Location extends StObject {
    
    /**
      * <p>The name of the file being compared, including its extension and subdirectory, if any.</p>
      */
    var filePath: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The position of a change within a compared file, in line number format.</p>
      */
    var filePosition: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that comparison.</p>
      */
    var relativeFileVersion: js.UndefOr[BEFORE | AFTER | String] = js.undefined
  }
  object Location {
    
    inline def apply(): Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      inline def setFilePosition(value: Double): Self = StObject.set(x, "filePosition", value.asInstanceOf[js.Any])
      
      inline def setFilePositionUndefined: Self = StObject.set(x, "filePosition", js.undefined)
      
      inline def setRelativeFileVersion(value: BEFORE | AFTER | String): Self = StObject.set(x, "relativeFileVersion", value.asInstanceOf[js.Any])
      
      inline def setRelativeFileVersionUndefined: Self = StObject.set(x, "relativeFileVersion", js.undefined)
    }
  }
  
  type UnmarshalledLocation = Location
}
