package typings.awsSdkClientCodecommitNode

import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.AFTER
import typings.awsSdkClientCodecommitNode.awsSdkClientCodecommitNodeStrings.BEFORE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLocationMod {
  
  @js.native
  trait Location extends StObject {
    
    /**
      * <p>The name of the file being compared, including its extension and subdirectory, if any.</p>
      */
    var filePath: js.UndefOr[String] = js.native
    
    /**
      * <p>The position of a change within a compared file, in line number format.</p>
      */
    var filePosition: js.UndefOr[Double] = js.native
    
    /**
      * <p>In a comparison of commits or a pull request, whether the change is in the 'before' or 'after' of that comparison.</p>
      */
    var relativeFileVersion: js.UndefOr[BEFORE | AFTER | String] = js.native
  }
  object Location {
    
    @scala.inline
    def apply(): Location = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
      
      @scala.inline
      def setFilePosition(value: Double): Self = StObject.set(x, "filePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilePositionUndefined: Self = StObject.set(x, "filePosition", js.undefined)
      
      @scala.inline
      def setRelativeFileVersion(value: BEFORE | AFTER | String): Self = StObject.set(x, "relativeFileVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelativeFileVersionUndefined: Self = StObject.set(x, "relativeFileVersion", js.undefined)
    }
  }
  
  type UnmarshalledLocation = Location
}
