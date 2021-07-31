package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetentionPolicy extends StObject {
  
  /**
    * The default is Retain, which specifies to keep the data stored on the EFS volume. Specify Delete to delete the data stored on the EFS volume.
    */
  var HomeEfsFileSystem: js.UndefOr[RetentionType] = js.undefined
}
object RetentionPolicy {
  
  @scala.inline
  def apply(): RetentionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetentionPolicy]
  }
  
  @scala.inline
  implicit class RetentionPolicyMutableBuilder[Self <: RetentionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHomeEfsFileSystem(value: RetentionType): Self = StObject.set(x, "HomeEfsFileSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeEfsFileSystemUndefined: Self = StObject.set(x, "HomeEfsFileSystem", js.undefined)
  }
}
