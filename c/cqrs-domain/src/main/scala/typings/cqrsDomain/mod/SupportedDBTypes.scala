package typings.cqrsDomain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.cqrsDomain.cqrsDomainStrings.mongodb
  - typings.cqrsDomain.cqrsDomainStrings.redis
  - typings.cqrsDomain.cqrsDomainStrings.tingodb
  - typings.cqrsDomain.cqrsDomainStrings.azuretable
  - typings.cqrsDomain.cqrsDomainStrings.inmemory
*/
trait SupportedDBTypes extends js.Object

object SupportedDBTypes {
  @scala.inline
  def azuretable: typings.cqrsDomain.cqrsDomainStrings.azuretable = this.cast("azuretable")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inmemory: typings.cqrsDomain.cqrsDomainStrings.inmemory = this.cast("inmemory")
  @scala.inline
  def mongodb: typings.cqrsDomain.cqrsDomainStrings.mongodb = this.cast("mongodb")
  @scala.inline
  def redis: typings.cqrsDomain.cqrsDomainStrings.redis = this.cast("redis")
  @scala.inline
  def tingodb: typings.cqrsDomain.cqrsDomainStrings.tingodb = this.cast("tingodb")
}

