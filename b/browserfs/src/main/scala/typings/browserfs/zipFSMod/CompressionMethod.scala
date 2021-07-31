package typings.browserfs.zipFSMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CompressionMethod extends StObject
@JSImport("browserfs/dist/node/backend/ZipFS", "CompressionMethod")
@js.native
object CompressionMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CompressionMethod & Double] = js.native
  
  @js.native
  sealed trait BZIP2
    extends StObject
       with CompressionMethod
  /* 12 */ val BZIP2: typings.browserfs.zipFSMod.CompressionMethod.BZIP2 & Double = js.native
  
  @js.native
  sealed trait DEFLATE
    extends StObject
       with CompressionMethod
  /* 8 */ val DEFLATE: typings.browserfs.zipFSMod.CompressionMethod.DEFLATE & Double = js.native
  
  @js.native
  sealed trait DEFLATE64
    extends StObject
       with CompressionMethod
  /* 9 */ val DEFLATE64: typings.browserfs.zipFSMod.CompressionMethod.DEFLATE64 & Double = js.native
  
  @js.native
  sealed trait IMPLODE
    extends StObject
       with CompressionMethod
  /* 6 */ val IMPLODE: typings.browserfs.zipFSMod.CompressionMethod.IMPLODE & Double = js.native
  
  @js.native
  sealed trait LZ77
    extends StObject
       with CompressionMethod
  /* 19 */ val LZ77: typings.browserfs.zipFSMod.CompressionMethod.LZ77 & Double = js.native
  
  @js.native
  sealed trait LZMA
    extends StObject
       with CompressionMethod
  /* 14 */ val LZMA: typings.browserfs.zipFSMod.CompressionMethod.LZMA & Double = js.native
  
  @js.native
  sealed trait PPMD
    extends StObject
       with CompressionMethod
  /* 98 */ val PPMD: typings.browserfs.zipFSMod.CompressionMethod.PPMD & Double = js.native
  
  @js.native
  sealed trait REDUCED_1
    extends StObject
       with CompressionMethod
  /* 2 */ val REDUCED_1: typings.browserfs.zipFSMod.CompressionMethod.REDUCED_1 & Double = js.native
  
  @js.native
  sealed trait REDUCED_2
    extends StObject
       with CompressionMethod
  /* 3 */ val REDUCED_2: typings.browserfs.zipFSMod.CompressionMethod.REDUCED_2 & Double = js.native
  
  @js.native
  sealed trait REDUCED_3
    extends StObject
       with CompressionMethod
  /* 4 */ val REDUCED_3: typings.browserfs.zipFSMod.CompressionMethod.REDUCED_3 & Double = js.native
  
  @js.native
  sealed trait REDUCED_4
    extends StObject
       with CompressionMethod
  /* 5 */ val REDUCED_4: typings.browserfs.zipFSMod.CompressionMethod.REDUCED_4 & Double = js.native
  
  @js.native
  sealed trait SHRUNK
    extends StObject
       with CompressionMethod
  /* 1 */ val SHRUNK: typings.browserfs.zipFSMod.CompressionMethod.SHRUNK & Double = js.native
  
  @js.native
  sealed trait STORED
    extends StObject
       with CompressionMethod
  /* 0 */ val STORED: typings.browserfs.zipFSMod.CompressionMethod.STORED & Double = js.native
  
  @js.native
  sealed trait TERSE_NEW
    extends StObject
       with CompressionMethod
  /* 18 */ val TERSE_NEW: typings.browserfs.zipFSMod.CompressionMethod.TERSE_NEW & Double = js.native
  
  @js.native
  sealed trait TERSE_OLD
    extends StObject
       with CompressionMethod
  /* 10 */ val TERSE_OLD: typings.browserfs.zipFSMod.CompressionMethod.TERSE_OLD & Double = js.native
  
  @js.native
  sealed trait WAVPACK
    extends StObject
       with CompressionMethod
  /* 97 */ val WAVPACK: typings.browserfs.zipFSMod.CompressionMethod.WAVPACK & Double = js.native
}
