package typings.azureKeyvaultKeys.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KnownDeletionRecoveryLevel extends StObject
@JSImport("@azure/keyvault-keys", "KnownDeletionRecoveryLevel")
@js.native
object KnownDeletionRecoveryLevel extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[KnownDeletionRecoveryLevel & String] = js.native
  
  /** Denotes a vault state in which deletion is recoverable without the possibility for immediate and permanent deletion (i.e. purge when 7<= SoftDeleteRetentionInDays < 90).This level guarantees the recoverability of the deleted entity during the retention interval and while the subscription is still available. */
  @js.native
  sealed trait CustomizedRecoverable
    extends StObject
       with KnownDeletionRecoveryLevel
  /* "CustomizedRecoverable" */ val CustomizedRecoverable: typings.azureKeyvaultKeys.mod.KnownDeletionRecoveryLevel.CustomizedRecoverable & String = js.native
  
  /** Denotes a vault and subscription state in which deletion is recoverable, immediate and permanent deletion (i.e. purge) is not permitted, and in which the subscription itself cannot be permanently canceled when 7<= SoftDeleteRetentionInDays < 90. This level guarantees the recoverability of the deleted entity during the retention interval, and also reflects the fact that the subscription itself cannot be cancelled. */
  @js.native
  sealed trait CustomizedRecoverableProtectedSubscription
    extends StObject
       with KnownDeletionRecoveryLevel
  /* "CustomizedRecoverable+ProtectedSubscription" */ val CustomizedRecoverableProtectedSubscription: typings.azureKeyvaultKeys.mod.KnownDeletionRecoveryLevel.CustomizedRecoverableProtectedSubscription & String = js.native
  
  /** Denotes a vault state in which deletion is recoverable, and which also permits immediate and permanent deletion (i.e. purge when 7<= SoftDeleteRetentionInDays < 90). This level guarantees the recoverability of the deleted entity during the retention interval, unless a Purge operation is requested, or the subscription is cancelled. */
  @js.native
  sealed trait CustomizedRecoverablePurgeable
    extends StObject
       with KnownDeletionRecoveryLevel
  /* "CustomizedRecoverable+Purgeable" */ val CustomizedRecoverablePurgeable: typings.azureKeyvaultKeys.mod.KnownDeletionRecoveryLevel.CustomizedRecoverablePurgeable & String = js.native
  
  /** Denotes a vault state in which deletion is an irreversible operation, without the possibility for recovery. This level corresponds to no protection being available against a Delete operation; the data is irretrievably lost upon accepting a Delete operation at the entity level or higher (vault, resource group, subscription etc.) */
  @js.native
  sealed trait Purgeable
    extends StObject
       with KnownDeletionRecoveryLevel
  /* "Purgeable" */ val Purgeable: typings.azureKeyvaultKeys.mod.KnownDeletionRecoveryLevel.Purgeable & String = js.native
  
  /** Denotes a vault state in which deletion is recoverable without the possibility for immediate and permanent deletion (i.e. purge). This level guarantees the recoverability of the deleted entity during the retention interval(90 days) and while the subscription is still available. System wil permanently delete it after 90 days, if not recovered */
  @js.native
  sealed trait Recoverable
    extends StObject
       with KnownDeletionRecoveryLevel
  /* "Recoverable" */ val Recoverable: typings.azureKeyvaultKeys.mod.KnownDeletionRecoveryLevel.Recoverable & String = js.native
  
  /** Denotes a vault and subscription state in which deletion is recoverable within retention interval (90 days), immediate and permanent deletion (i.e. purge) is not permitted, and in which the subscription itself  cannot be permanently canceled. System wil permanently delete it after 90 days, if not recovered */
  @js.native
  sealed trait RecoverableProtectedSubscription
    extends StObject
       with KnownDeletionRecoveryLevel
  /* "Recoverable+ProtectedSubscription" */ val RecoverableProtectedSubscription: typings.azureKeyvaultKeys.mod.KnownDeletionRecoveryLevel.RecoverableProtectedSubscription & String = js.native
  
  /** Denotes a vault state in which deletion is recoverable, and which also permits immediate and permanent deletion (i.e. purge). This level guarantees the recoverability of the deleted entity during the retention interval (90 days), unless a Purge operation is requested, or the subscription is cancelled. System wil permanently delete it after 90 days, if not recovered */
  @js.native
  sealed trait RecoverablePurgeable
    extends StObject
       with KnownDeletionRecoveryLevel
  /* "Recoverable+Purgeable" */ val RecoverablePurgeable: typings.azureKeyvaultKeys.mod.KnownDeletionRecoveryLevel.RecoverablePurgeable & String = js.native
}
