package typings.cqrsDomain

import typings.cqrsDomain.mod.SupportedDBTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cqrsDomainStrings {
  @js.native
  sealed trait azuretable extends SupportedDBTypes
  
  @js.native
  sealed trait inmemory extends SupportedDBTypes
  
  @js.native
  sealed trait mongodb extends SupportedDBTypes
  
  @js.native
  sealed trait redis extends SupportedDBTypes
  
  @js.native
  sealed trait tingodb extends SupportedDBTypes
  
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

