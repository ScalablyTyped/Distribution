package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrawlerTargets extends StObject {
  
  /**
    * Specifies AWS Glue Data Catalog targets.
    */
  var CatalogTargets: js.UndefOr[CatalogTargetList] = js.native
  
  /**
    * Specifies Amazon DynamoDB targets.
    */
  var DynamoDBTargets: js.UndefOr[DynamoDBTargetList] = js.native
  
  /**
    * Specifies JDBC targets.
    */
  var JdbcTargets: js.UndefOr[JdbcTargetList] = js.native
  
  /**
    * Specifies Amazon DocumentDB or MongoDB targets.
    */
  var MongoDBTargets: js.UndefOr[MongoDBTargetList] = js.native
  
  /**
    * Specifies Amazon Simple Storage Service (Amazon S3) targets.
    */
  var S3Targets: js.UndefOr[S3TargetList] = js.native
}
object CrawlerTargets {
  
  @scala.inline
  def apply(): CrawlerTargets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrawlerTargets]
  }
  
  @scala.inline
  implicit class CrawlerTargetsMutableBuilder[Self <: CrawlerTargets] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogTargets(value: CatalogTargetList): Self = StObject.set(x, "CatalogTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogTargetsUndefined: Self = StObject.set(x, "CatalogTargets", js.undefined)
    
    @scala.inline
    def setCatalogTargetsVarargs(value: CatalogTarget*): Self = StObject.set(x, "CatalogTargets", js.Array(value :_*))
    
    @scala.inline
    def setDynamoDBTargets(value: DynamoDBTargetList): Self = StObject.set(x, "DynamoDBTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamoDBTargetsUndefined: Self = StObject.set(x, "DynamoDBTargets", js.undefined)
    
    @scala.inline
    def setDynamoDBTargetsVarargs(value: DynamoDBTarget*): Self = StObject.set(x, "DynamoDBTargets", js.Array(value :_*))
    
    @scala.inline
    def setJdbcTargets(value: JdbcTargetList): Self = StObject.set(x, "JdbcTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJdbcTargetsUndefined: Self = StObject.set(x, "JdbcTargets", js.undefined)
    
    @scala.inline
    def setJdbcTargetsVarargs(value: JdbcTarget*): Self = StObject.set(x, "JdbcTargets", js.Array(value :_*))
    
    @scala.inline
    def setMongoDBTargets(value: MongoDBTargetList): Self = StObject.set(x, "MongoDBTargets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMongoDBTargetsUndefined: Self = StObject.set(x, "MongoDBTargets", js.undefined)
    
    @scala.inline
    def setMongoDBTargetsVarargs(value: MongoDBTarget*): Self = StObject.set(x, "MongoDBTargets", js.Array(value :_*))
    
    @scala.inline
    def setS3Targets(value: S3TargetList): Self = StObject.set(x, "S3Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3TargetsUndefined: Self = StObject.set(x, "S3Targets", js.undefined)
    
    @scala.inline
    def setS3TargetsVarargs(value: S3Target*): Self = StObject.set(x, "S3Targets", js.Array(value :_*))
  }
}
