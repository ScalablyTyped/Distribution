package typings.blake2sJs

import typings.blake2sJs.blake2sJsInts.`32`
import typings.blake2sJs.blake2sJsInts.`64`
import typings.blake2sJs.blake2sJsInts.`8`
import typings.blake2sJs.mod.BLAKE2sConfig
import typings.blake2sJs.mod.ByteArray
import typings.blake2sJs.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("BLAKE2s")
  @js.native
  open class BLAKE2s () extends default {
    def this(digestLength: Double) = this()
    def this(digestLength: Double, config: BLAKE2sConfig) = this()
    def this(digestLength: Double, key: ByteArray) = this()
    def this(digestLength: Unit, config: BLAKE2sConfig) = this()
    def this(digestLength: Unit, key: ByteArray) = this()
  }
  /* static members */
  object BLAKE2s {
    
    @JSGlobal("BLAKE2s.blockLength")
    @js.native
    val blockLength: `64` = js.native
    
    @JSGlobal("BLAKE2s.digestLength")
    @js.native
    val digestLength: `32` = js.native
    
    @JSGlobal("BLAKE2s.keyLength")
    @js.native
    val keyLength: `32` = js.native
    
    @JSGlobal("BLAKE2s.personalizationLength")
    @js.native
    val personalizationLength: `8` = js.native
    
    @JSGlobal("BLAKE2s.saltLength")
    @js.native
    val saltLength: `8` = js.native
  }
}
