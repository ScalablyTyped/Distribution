package typings
package cqrsDashDomainLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object cqrsDashDomainLibStrings {
  @js.native
  sealed trait azuretable extends js.Object
  
  @js.native
  sealed trait inmemory extends js.Object
  
  @js.native
  sealed trait mongodb extends js.Object
  
  @js.native
  sealed trait redis extends js.Object
  
  @js.native
  sealed trait tingodb extends js.Object
  
  def azuretable: azuretable = "azuretable".asInstanceOf[azuretable]
  def inmemory: inmemory = "inmemory".asInstanceOf[inmemory]
  def mongodb: mongodb = "mongodb".asInstanceOf[mongodb]
  def redis: redis = "redis".asInstanceOf[redis]
  def tingodb: tingodb = "tingodb".asInstanceOf[tingodb]
}

