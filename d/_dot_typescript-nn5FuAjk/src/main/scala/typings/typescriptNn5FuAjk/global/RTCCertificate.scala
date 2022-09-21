package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.EpochTimeStamp
import typings.typescriptNn5FuAjk.RTCDtlsFingerprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("RTCCertificate")
@js.native
open class RTCCertificate ()
  extends StObject
     with typings.typescriptNn5FuAjk.RTCCertificate {
  
  /* CompleteClass */
  override val expires: EpochTimeStamp = js.native
  
  /* CompleteClass */
  override def getFingerprints(): typings.typescriptNn5FuAjk.Array[RTCDtlsFingerprint] = js.native
}
