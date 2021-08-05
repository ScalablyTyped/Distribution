package typings.contentfulManagement

import typings.contentfulManagement.appDefinitionMod.AppLocation
import typings.contentfulManagement.appDefinitionMod.Field
import typings.contentfulManagement.appDefinitionMod.LinkType
import typings.contentfulManagement.roleMod.ActionType
import typings.contentfulManagement.roleMod.ConditionType
import typings.contentfulManagement.usageMod.UsageMetricEnum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentfulManagementStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait Array extends StObject
  inline def Array: Array = "Array".asInstanceOf[Array]
  
  @js.native
  sealed trait Asset
    extends StObject
       with LinkType
  inline def Asset: Asset = "Asset".asInstanceOf[Asset]
  
  @js.native
  sealed trait Boolean
    extends StObject
       with Field
  inline def Boolean: Boolean = "Boolean".asInstanceOf[Boolean]
  
  @js.native
  sealed trait DELETE extends StObject
  inline def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  
  @js.native
  sealed trait Date
    extends StObject
       with Field
  inline def Date: Date = "Date".asInstanceOf[Date]
  
  @js.native
  sealed trait Entry
    extends StObject
       with LinkType
  inline def Entry: Entry = "Entry".asInstanceOf[Entry]
  
  @js.native
  sealed trait Environment extends StObject
  inline def Environment: Environment = "Environment".asInstanceOf[Environment]
  
  @js.native
  sealed trait GET extends StObject
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait Integer
    extends StObject
       with Field
  inline def Integer: Integer = "Integer".asInstanceOf[Integer]
  
  @js.native
  sealed trait Link extends StObject
  inline def Link: Link = "Link".asInstanceOf[Link]
  
  @js.native
  sealed trait Location
    extends StObject
       with Field
  inline def Location: Location = "Location".asInstanceOf[Location]
  
  @js.native
  sealed trait Number
    extends StObject
       with Field
  inline def Number: Number = "Number".asInstanceOf[Number]
  
  @js.native
  sealed trait Object
    extends StObject
       with Field
  inline def Object: Object = "Object".asInstanceOf[Object]
  
  @js.native
  sealed trait PATCH extends StObject
  inline def PATCH: PATCH = "PATCH".asInstanceOf[PATCH]
  
  @js.native
  sealed trait POST extends StObject
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait PUT extends StObject
  inline def PUT: PUT = "PUT".asInstanceOf[PUT]
  
  @js.native
  sealed trait RichText
    extends StObject
       with Field
  inline def RichText: RichText = "RichText".asInstanceOf[RichText]
  
  @js.native
  sealed trait Symbol
    extends StObject
       with Field
  inline def Symbol: Symbol = "Symbol".asInstanceOf[Symbol]
  
  @js.native
  sealed trait Tag extends StObject
  inline def Tag: Tag = "Tag".asInstanceOf[Tag]
  
  @js.native
  sealed trait Text
    extends StObject
       with Field
  inline def Text: Text = "Text".asInstanceOf[Text]
  
  @js.native
  sealed trait all extends StObject
  inline def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait and
    extends StObject
       with ConditionType
  inline def and: and = "and".asInstanceOf[and]
  
  @js.native
  sealed trait `app-config`
    extends StObject
       with AppLocation
  inline def `app-config`: `app-config` = "app-config".asInstanceOf[`app-config`]
  
  @js.native
  sealed trait applicationSlashjson extends StObject
  inline def applicationSlashjson: applicationSlashjson = "application/json".asInstanceOf[applicationSlashjson]
  
  @js.native
  sealed trait `applicationSlashjsonSemicolon charsetEqualssignutf-8` extends StObject
  inline def `applicationSlashjsonSemicolon charsetEqualssignutf-8`: `applicationSlashjsonSemicolon charsetEqualssignutf-8` = ("application/json; charset=utf-8").asInstanceOf[`applicationSlashjsonSemicolon charsetEqualssignutf-8`]
  
  @js.native
  sealed trait applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson extends StObject
  inline def applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson: applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson = "application/vnd.contentful.management.v1+json".asInstanceOf[applicationSlashvndDotcontentfulDotmanagementDotv1Plussignjson]
  
  @js.native
  sealed trait `applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8` extends StObject
  inline def `applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8`: `applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8` = ("application/vnd.contentful.management.v1+json; charset=utf-8").asInstanceOf[`applicationSlashvndDotcontentfulDotmanagementDotv1PlussignjsonSemicolon charsetEqualssignutf-8`]
  
  @js.native
  sealed trait `applicationSlashx-www-form-urlencoded` extends StObject
  inline def `applicationSlashx-www-form-urlencoded`: `applicationSlashx-www-form-urlencoded` = "application/x-www-form-urlencoded".asInstanceOf[`applicationSlashx-www-form-urlencoded`]
  
  @js.native
  sealed trait `applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8` extends StObject
  inline def `applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8`: `applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8` = ("application/x-www-form-urlencoded; charset=utf-8").asInstanceOf[`applicationSlashx-www-form-urlencodedSemicolon charsetEqualssignutf-8`]
  
  @js.native
  sealed trait archive
    extends StObject
       with ActionType
  inline def archive: archive = "archive".asInstanceOf[archive]
  
  @js.native
  sealed trait cda
    extends StObject
       with UsageMetricEnum
  inline def cda: cda = "cda".asInstanceOf[cda]
  
  @js.native
  sealed trait cma
    extends StObject
       with UsageMetricEnum
  inline def cma: cma = "cma".asInstanceOf[cma]
  
  @js.native
  sealed trait contentDeliveryApi extends StObject
  inline def contentDeliveryApi: contentDeliveryApi = "contentDeliveryApi".asInstanceOf[contentDeliveryApi]
  
  @js.native
  sealed trait contentManagementApi extends StObject
  inline def contentManagementApi: contentManagementApi = "contentManagementApi".asInstanceOf[contentManagementApi]
  
  @js.native
  sealed trait content_management_manage extends StObject
  inline def content_management_manage: content_management_manage = "content_management_manage".asInstanceOf[content_management_manage]
  
  @js.native
  sealed trait cpa
    extends StObject
       with UsageMetricEnum
  inline def cpa: cpa = "cpa".asInstanceOf[cpa]
  
  @js.native
  sealed trait create
    extends StObject
       with ActionType
  inline def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait delete_
    extends StObject
       with ActionType
  inline def delete_ : delete_ = "delete".asInstanceOf[delete_]
  
  @js.native
  sealed trait description extends StObject
  inline def description: description = "description".asInstanceOf[description]
  
  @js.native
  sealed trait dialog
    extends StObject
       with AppLocation
  inline def dialog: dialog = "dialog".asInstanceOf[dialog]
  
  @js.native
  sealed trait displayField extends StObject
  inline def displayField: displayField = "displayField".asInstanceOf[displayField]
  
  @js.native
  sealed trait `entry-editor`
    extends StObject
       with AppLocation
  inline def `entry-editor`: `entry-editor` = "entry-editor".asInstanceOf[`entry-editor`]
  
  @js.native
  sealed trait `entry-field` extends StObject
  inline def `entry-field`: `entry-field` = "entry-field".asInstanceOf[`entry-field`]
  
  @js.native
  sealed trait `entry-sidebar`
    extends StObject
       with AppLocation
  inline def `entry-sidebar`: `entry-sidebar` = "entry-sidebar".asInstanceOf[`entry-sidebar`]
  
  @js.native
  sealed trait equals
    extends StObject
       with ConditionType
  inline def equals: equals = "equals".asInstanceOf[equals]
  
  @js.native
  sealed trait gql
    extends StObject
       with UsageMetricEnum
  inline def gql: gql = "gql".asInstanceOf[gql]
  
  @js.native
  sealed trait not
    extends StObject
       with ConditionType
  inline def not: not = "not".asInstanceOf[not]
  
  @js.native
  sealed trait optional extends StObject
  inline def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait or
    extends StObject
       with ConditionType
  inline def or: or = "or".asInstanceOf[or]
  
  @js.native
  sealed trait page
    extends StObject
       with AppLocation
  inline def page: page = "page".asInstanceOf[page]
  
  @js.native
  sealed trait publish
    extends StObject
       with ActionType
  inline def publish: publish = "publish".asInstanceOf[publish]
  
  @js.native
  sealed trait read
    extends StObject
       with ActionType
  inline def read: read = "read".asInstanceOf[read]
  
  @js.native
  sealed trait sysDotcontentTypeDotsysDotid extends StObject
  inline def sysDotcontentTypeDotsysDotid: sysDotcontentTypeDotsysDotid = "sys.contentType.sys.id".asInstanceOf[sysDotcontentTypeDotsysDotid]
  
  @js.native
  sealed trait sysDotenvironmentDotsysDotid extends StObject
  inline def sysDotenvironmentDotsysDotid: sysDotenvironmentDotsysDotid = "sys.environment.sys.id".asInstanceOf[sysDotenvironmentDotsysDotid]
  
  @js.native
  sealed trait sysDotid extends StObject
  inline def sysDotid: sysDotid = "sys.id".asInstanceOf[sysDotid]
  
  @js.native
  sealed trait unarchive
    extends StObject
       with ActionType
  inline def unarchive: unarchive = "unarchive".asInstanceOf[unarchive]
  
  @js.native
  sealed trait unpublish
    extends StObject
       with ActionType
  inline def unpublish: unpublish = "unpublish".asInstanceOf[unpublish]
  
  @js.native
  sealed trait update
    extends StObject
       with ActionType
  inline def update: update = "update".asInstanceOf[update]
}
