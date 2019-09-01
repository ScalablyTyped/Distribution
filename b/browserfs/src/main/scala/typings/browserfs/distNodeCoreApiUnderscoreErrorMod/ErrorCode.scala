package typings.browserfs.distNodeCoreApiUnderscoreErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorCode extends js.Object

@JSImport("browserfs/dist/node/core/api_error", "ErrorCode")
@js.native
object ErrorCode extends js.Object {
  @js.native
  sealed trait EACCES extends ErrorCode
  
  @js.native
  sealed trait EBADF extends ErrorCode
  
  @js.native
  sealed trait EBUSY extends ErrorCode
  
  @js.native
  sealed trait EEXIST extends ErrorCode
  
  @js.native
  sealed trait EFBIG extends ErrorCode
  
  @js.native
  sealed trait EINVAL extends ErrorCode
  
  @js.native
  sealed trait EIO extends ErrorCode
  
  @js.native
  sealed trait EISDIR extends ErrorCode
  
  @js.native
  sealed trait ENOENT extends ErrorCode
  
  @js.native
  sealed trait ENOSPC extends ErrorCode
  
  @js.native
  sealed trait ENOTDIR extends ErrorCode
  
  @js.native
  sealed trait ENOTEMPTY extends ErrorCode
  
  @js.native
  sealed trait ENOTSUP extends ErrorCode
  
  @js.native
  sealed trait EPERM extends ErrorCode
  
  @js.native
  sealed trait EROFS extends ErrorCode
  
  /* 13 */ val EACCES: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EACCES with Double = js.native
  /* 9 */ val EBADF: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EBADF with Double = js.native
  /* 16 */ val EBUSY: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EBUSY with Double = js.native
  /* 17 */ val EEXIST: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EEXIST with Double = js.native
  /* 27 */ val EFBIG: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EFBIG with Double = js.native
  /* 22 */ val EINVAL: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EINVAL with Double = js.native
  /* 5 */ val EIO: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EIO with Double = js.native
  /* 21 */ val EISDIR: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EISDIR with Double = js.native
  /* 2 */ val ENOENT: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.ENOENT with Double = js.native
  /* 28 */ val ENOSPC: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.ENOSPC with Double = js.native
  /* 20 */ val ENOTDIR: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.ENOTDIR with Double = js.native
  /* 39 */ val ENOTEMPTY: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.ENOTEMPTY with Double = js.native
  /* 95 */ val ENOTSUP: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.ENOTSUP with Double = js.native
  /* 1 */ val EPERM: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EPERM with Double = js.native
  /* 30 */ val EROFS: typings.browserfs.distNodeCoreApiUnderscoreErrorMod.ErrorCode.EROFS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ErrorCode with Double] = js.native
}

