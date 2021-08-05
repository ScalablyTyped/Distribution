package typings.awsSdkMd5Universal

import typings.awsSdkMd5Universal.awsSdkMd5UniversalStrings.ascii
import typings.awsSdkMd5Universal.awsSdkMd5UniversalStrings.latin1
import typings.awsSdkMd5Universal.awsSdkMd5UniversalStrings.utf8
import typings.awsSdkTypes.cryptoMod.Hash
import typings.awsSdkTypes.cryptoMod.SourceData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/md5-universal", "Md5")
  @js.native
  class Md5 ()
    extends StObject
       with Hash {
    
    /* private */ val hash: js.Any = js.native
    
    @JSName("update")
    def update_ascii(data: SourceData, encoding: ascii): Unit = js.native
    @JSName("update")
    def update_latin1(data: SourceData, encoding: latin1): Unit = js.native
    @JSName("update")
    def update_utf8(data: SourceData, encoding: utf8): Unit = js.native
  }
}
