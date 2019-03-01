package typings
package cqrsDashDomainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cqrsDashDomainLibStrings {
  @js.native
  sealed trait azuretable
    extends cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.SupportedDBTypes
  
  @js.native
  sealed trait inmemory
    extends cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.SupportedDBTypes
  
  @js.native
  sealed trait mongodb
    extends cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.SupportedDBTypes
  
  @js.native
  sealed trait redis
    extends cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.SupportedDBTypes
  
  @js.native
  sealed trait tingodb
    extends cqrsDashDomainLib.cqrsDashDomainMod.DomainNs.SupportedDBTypes
  
  @scala.inline
  def azuretable: azuretable = "azuretable".asInstanceOf[azuretable]
  @scala.inline
  def inmemory: inmemory = "inmemory".asInstanceOf[inmemory]
  @scala.inline
  def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  @scala.inline
  def redis: redis = "redis".asInstanceOf[redis]
  @scala.inline
  def tingodb: tingodb = "tingodb".asInstanceOf[tingodb]
}

