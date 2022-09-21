package typings.typescriptNn5FuAjk.global

import typings.typescriptNn5FuAjk.PushEncryptionKeyName
import typings.typescriptNn5FuAjk.PushSubscriptionJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("PushSubscription")
@js.native
open class PushSubscription ()
  extends StObject
     with typings.typescriptNn5FuAjk.PushSubscription {
  
  /* CompleteClass */
  override val endpoint: java.lang.String = js.native
  
  /* CompleteClass */
  override def getKey(name: PushEncryptionKeyName): typings.typescriptNn5FuAjk.ArrayBuffer | Null = js.native
  
  /* CompleteClass */
  override val options: typings.typescriptNn5FuAjk.PushSubscriptionOptions = js.native
  
  /* CompleteClass */
  override def toJSON(): PushSubscriptionJSON = js.native
  
  /* CompleteClass */
  override def unsubscribe(): typings.typescriptNn5FuAjk.Promise[scala.Boolean] = js.native
}
