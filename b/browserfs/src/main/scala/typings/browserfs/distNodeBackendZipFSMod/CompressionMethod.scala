package typings.browserfs.distNodeBackendZipFSMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CompressionMethod extends js.Object

@JSImport("browserfs/dist/node/backend/ZipFS", "CompressionMethod")
@js.native
object CompressionMethod extends js.Object {
  @js.native
  sealed trait BZIP2 extends CompressionMethod
  
  @js.native
  sealed trait DEFLATE extends CompressionMethod
  
  @js.native
  sealed trait DEFLATE64 extends CompressionMethod
  
  @js.native
  sealed trait IMPLODE extends CompressionMethod
  
  @js.native
  sealed trait LZ77 extends CompressionMethod
  
  @js.native
  sealed trait LZMA extends CompressionMethod
  
  @js.native
  sealed trait PPMD extends CompressionMethod
  
  @js.native
  sealed trait REDUCED_1 extends CompressionMethod
  
  @js.native
  sealed trait REDUCED_2 extends CompressionMethod
  
  @js.native
  sealed trait REDUCED_3 extends CompressionMethod
  
  @js.native
  sealed trait REDUCED_4 extends CompressionMethod
  
  @js.native
  sealed trait SHRUNK extends CompressionMethod
  
  @js.native
  sealed trait STORED extends CompressionMethod
  
  @js.native
  sealed trait TERSE_NEW extends CompressionMethod
  
  @js.native
  sealed trait TERSE_OLD extends CompressionMethod
  
  @js.native
  sealed trait WAVPACK extends CompressionMethod
  
  /* 12 */ val BZIP2: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.BZIP2 with Double = js.native
  /* 8 */ val DEFLATE: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.DEFLATE with Double = js.native
  /* 9 */ val DEFLATE64: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.DEFLATE64 with Double = js.native
  /* 6 */ val IMPLODE: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.IMPLODE with Double = js.native
  /* 19 */ val LZ77: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.LZ77 with Double = js.native
  /* 14 */ val LZMA: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.LZMA with Double = js.native
  /* 98 */ val PPMD: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.PPMD with Double = js.native
  /* 2 */ val REDUCED_1: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.REDUCED_1 with Double = js.native
  /* 3 */ val REDUCED_2: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.REDUCED_2 with Double = js.native
  /* 4 */ val REDUCED_3: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.REDUCED_3 with Double = js.native
  /* 5 */ val REDUCED_4: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.REDUCED_4 with Double = js.native
  /* 1 */ val SHRUNK: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.SHRUNK with Double = js.native
  /* 0 */ val STORED: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.STORED with Double = js.native
  /* 18 */ val TERSE_NEW: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.TERSE_NEW with Double = js.native
  /* 10 */ val TERSE_OLD: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.TERSE_OLD with Double = js.native
  /* 97 */ val WAVPACK: typings.browserfs.distNodeBackendZipFSMod.CompressionMethod.WAVPACK with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionMethod with Double] = js.native
}

