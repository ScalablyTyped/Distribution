package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PosixProfile extends StObject {
  
  /**
    * The POSIX group ID used for all EFS operations by this user.
    */
  var Gid: PosixId
  
  /**
    * The secondary POSIX group IDs used for all EFS operations by this user.
    */
  var SecondaryGids: js.UndefOr[typings.awsSdk.transferMod.SecondaryGids] = js.undefined
  
  /**
    * The POSIX user ID used for all EFS operations by this user.
    */
  var Uid: PosixId
}
object PosixProfile {
  
  inline def apply(Gid: PosixId, Uid: PosixId): PosixProfile = {
    val __obj = js.Dynamic.literal(Gid = Gid.asInstanceOf[js.Any], Uid = Uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PosixProfile]
  }
  
  extension [Self <: PosixProfile](x: Self) {
    
    inline def setGid(value: PosixId): Self = StObject.set(x, "Gid", value.asInstanceOf[js.Any])
    
    inline def setSecondaryGids(value: SecondaryGids): Self = StObject.set(x, "SecondaryGids", value.asInstanceOf[js.Any])
    
    inline def setSecondaryGidsUndefined: Self = StObject.set(x, "SecondaryGids", js.undefined)
    
    inline def setSecondaryGidsVarargs(value: PosixId*): Self = StObject.set(x, "SecondaryGids", js.Array(value*))
    
    inline def setUid(value: PosixId): Self = StObject.set(x, "Uid", value.asInstanceOf[js.Any])
  }
}
