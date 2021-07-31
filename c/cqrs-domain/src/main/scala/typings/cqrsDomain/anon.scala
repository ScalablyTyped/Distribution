package typings.cqrsDomain

import typings.cqrsDomain.cqrsDomainStrings.inmemory
import typings.cqrsDomain.cqrsDomainStrings.mongodb
import typings.cqrsDomain.cqrsDomainStrings.redis
import typings.cqrsDomain.cqrsDomainStrings.tingodb
import typings.cqrsDomain.mod.SupportedDBTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Aggregate extends StObject {
    
    var aggregate: String
    
    var aggregateId: String
    
    var context: String
  }
  object Aggregate {
    
    @scala.inline
    def apply(aggregate: String, aggregateId: String, context: String): Aggregate = {
      val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any], aggregateId = aggregateId.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[Aggregate]
    }
    
    @scala.inline
    implicit class AggregateMutableBuilder[Self <: Aggregate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAggregate(value: String): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAggregateId(value: String): Self = StObject.set(x, "aggregateId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthSource extends StObject {
    
    var authSource: js.UndefOr[String] = js.undefined
    
    var dbName: js.UndefOr[String] = js.undefined
    
    var eventsCollectionName: js.UndefOr[String] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var snapshotsCollectionName: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var transactionsCollectionName: js.UndefOr[String] = js.undefined
    
    var `type`: SupportedDBTypes
    
    var url: js.UndefOr[String] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object AuthSource {
    
    @scala.inline
    def apply(`type`: SupportedDBTypes): AuthSource = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthSource]
    }
    
    @scala.inline
    implicit class AuthSourceMutableBuilder[Self <: AuthSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthSource(value: String): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
      
      @scala.inline
      def setDbName(value: String): Self = StObject.set(x, "dbName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbNameUndefined: Self = StObject.set(x, "dbName", js.undefined)
      
      @scala.inline
      def setEventsCollectionName(value: String): Self = StObject.set(x, "eventsCollectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventsCollectionNameUndefined: Self = StObject.set(x, "eventsCollectionName", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setSnapshotsCollectionName(value: String): Self = StObject.set(x, "snapshotsCollectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotsCollectionNameUndefined: Self = StObject.set(x, "snapshotsCollectionName", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTransactionsCollectionName(value: String): Self = StObject.set(x, "transactionsCollectionName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsCollectionNameUndefined: Self = StObject.set(x, "transactionsCollectionName", js.undefined)
      
      @scala.inline
      def setType(value: SupportedDBTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    }
  }
  
  trait Db extends StObject {
    
    var db: Double
    
    var host: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var `type`: SupportedDBTypes
  }
  object Db {
    
    @scala.inline
    def apply(db: Double, `type`: SupportedDBTypes): Db = {
      val __obj = js.Dynamic.literal(db = db.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Db]
    }
    
    @scala.inline
    implicit class DbMutableBuilder[Self <: Db] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDb(value: Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setType(value: SupportedDBTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Host extends StObject {
    
    var db: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var password: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[Double] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var ttl: js.UndefOr[Double] = js.undefined
    
    var `type`: mongodb | redis | tingodb | inmemory
  }
  object Host {
    
    @scala.inline
    def apply(`type`: mongodb | redis | tingodb | inmemory): Host = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDb(value: Double): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
      
      @scala.inline
      def setType(value: mongodb | redis | tingodb | inmemory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
