package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cesiumEngine.mod.Entity.ConstructorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "Entity")
@js.native
open class Entity () extends StObject {
  def this(options: ConstructorOptions) = this()
  
  /**
    * Adds a property to this object.  Once a property is added, it can be
    * observed with {@link Entity#definitionChanged} and composited
    * with {@link CompositeEntityCollection}
    * @param propertyName - The name of the property to add.
    */
  def addProperty(propertyName: String): Unit = js.native
  
  /**
    * The availability, if any, associated with this object.
    * If availability is undefined, it is assumed that this object's
    * other properties will return valid data for any provided time.
    * If availability exists, the objects other properties will only
    * provide valid data if queried within the given interval.
    */
  var availability: js.UndefOr[TimeIntervalCollection] = js.native
  
  /**
    * Gets or sets the billboard.
    */
  var billboard: js.UndefOr[BillboardGraphics] = js.native
  
  /**
    * Gets or sets the box.
    */
  var box: js.UndefOr[BoxGraphics] = js.native
  
  /**
    * Computes the model matrix for the entity's transform at specified time. Returns undefined if orientation or position
    * are undefined.
    * @param time - The time to retrieve model matrix for.
    * @param [result] - The object onto which to store the result.
    * @returns The modified result parameter or a new Matrix4 instance if one was not provided. Result is undefined if position or orientation are undefined.
    */
  def computeModelMatrix(time: JulianDate): Matrix4 = js.native
  def computeModelMatrix(time: JulianDate, result: Matrix4): Matrix4 = js.native
  
  /**
    * Gets or sets the corridor.
    */
  var corridor: js.UndefOr[CorridorGraphics] = js.native
  
  /**
    * Gets or sets the cylinder.
    */
  var cylinder: js.UndefOr[CylinderGraphics] = js.native
  
  /**
    * Gets the event that is raised whenever a property or sub-property is changed or modified.
    */
  val definitionChanged: Event[js.Function1[/* repeated */ Any, Unit]] = js.native
  
  /**
    * Gets or sets the description.
    */
  var description: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the ellipse.
    */
  var ellipse: js.UndefOr[EllipseGraphics] = js.native
  
  /**
    * Gets or sets the ellipsoid.
    */
  var ellipsoid: js.UndefOr[EllipsoidGraphics] = js.native
  
  /**
    * Gets or sets the entity collection that this entity belongs to.
    */
  var entityCollection: EntityCollection = js.native
  
  /**
    * Gets the unique ID associated with this object.
    */
  var id: String = js.native
  
  /**
    * Given a time, returns true if this object should have data during that time.
    * @param time - The time to check availability for.
    * @returns true if the object should have data during the provided time, false otherwise.
    */
  def isAvailable(time: JulianDate): Boolean = js.native
  
  /**
    * Gets whether this entity is being displayed, taking into account
    * the visibility of any ancestor entities.
    */
  var isShowing: Boolean = js.native
  
  /**
    * Gets or sets the label.
    */
  var label: js.UndefOr[LabelGraphics] = js.native
  
  /**
    * Assigns each unassigned property on this object to the value
    * of the same property on the provided source object.
    * @param source - The object to be merged into this object.
    */
  def merge(source: Entity): Unit = js.native
  
  /**
    * Gets or sets the model.
    */
  var model: js.UndefOr[ModelGraphics] = js.native
  
  /**
    * Gets or sets the name of the object.  The name is intended for end-user
    * consumption and does not need to be unique.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Gets or sets the orientation.
    */
  var orientation: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the parent object.
    */
  var parent: js.UndefOr[Entity] = js.native
  
  /**
    * Gets or sets the path.
    */
  var path: js.UndefOr[PathGraphics] = js.native
  
  /**
    * Gets or sets the plane.
    */
  var plane: js.UndefOr[PlaneGraphics] = js.native
  
  /**
    * Gets or sets the point graphic.
    */
  var point: js.UndefOr[PointGraphics] = js.native
  
  /**
    * Gets or sets the polygon.
    */
  var polygon: js.UndefOr[PolygonGraphics] = js.native
  
  /**
    * Gets or sets the polyline.
    */
  var polyline: js.UndefOr[PolylineGraphics] = js.native
  
  /**
    * Gets or sets the polyline volume.
    */
  var polylineVolume: js.UndefOr[PolylineVolumeGraphics] = js.native
  
  /**
    * Gets or sets the position.
    */
  var position: js.UndefOr[PositionProperty] = js.native
  
  /**
    * Gets or sets the bag of arbitrary properties associated with this entity.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * Gets the names of all properties registered on this instance.
    */
  var propertyNames: js.Array[String] = js.native
  
  /**
    * Gets or sets the rectangle.
    */
  var rectangle: js.UndefOr[RectangleGraphics] = js.native
  
  /**
    * Removed a property previously added with addProperty.
    * @param propertyName - The name of the property to remove.
    */
  def removeProperty(propertyName: String): Unit = js.native
  
  /**
    * Gets or sets whether this entity should be displayed. When set to true,
    * the entity is only displayed if the parent entity's show property is also true.
    */
  var show: Boolean = js.native
  
  /**
    * Gets or sets the tileset.
    */
  var tileset: js.UndefOr[Cesium3DTilesetGraphics] = js.native
  
  /**
    * Gets or sets the suggested initial offset when tracking this object.
    * The offset is typically defined in the east-north-up reference frame,
    * but may be another frame depending on the object's velocity.
    */
  var viewFrom: js.UndefOr[Property] = js.native
  
  /**
    * Gets or sets the wall.
    */
  var wall: js.UndefOr[WallGraphics] = js.native
}
/* static members */
object Entity {
  
  @JSImport("@cesium/engine", "Entity")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Checks if the given Scene supports materials besides Color on Entities draped on terrain or 3D Tiles.
    * If this feature is not supported, Entities with non-color materials but no `height` will
    * instead be rendered as if height is 0.
    * @param scene - The current scene.
    * @returns Whether or not the current scene supports materials for entities on terrain.
    */
  inline def supportsMaterialsforEntitiesOnTerrain(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsMaterialsforEntitiesOnTerrain")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Checks if the given Scene supports polylines clamped to terrain or 3D Tiles.
    * If this feature is not supported, Entities with PolylineGraphics will be rendered with vertices at
    * the provided heights and using the `arcType` parameter instead of clamped to the ground.
    * @param scene - The current scene.
    * @returns Whether or not the current scene supports polylines on terrain or 3D TIles.
    */
  inline def supportsPolylinesOnTerrain(scene: Scene): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsPolylinesOnTerrain")(scene.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /**
    * Initialization options for the Entity constructor
    * @property [id] - A unique identifier for this object. If none is provided, a GUID is generated.
    * @property [name] - A human readable name to display to users. It does not have to be unique.
    * @property [availability] - The availability, if any, associated with this object.
    * @property [show] - A boolean value indicating if the entity and its children are displayed.
    * @property [description] - A string Property specifying an HTML description for this entity.
    * @property [position] - A Property specifying the entity position.
    * @property [orientation] - A Property specifying the entity orientation.
    * @property [viewFrom] - A suggested initial offset for viewing this object.
    * @property [parent] - A parent entity to associate with this entity.
    * @property [billboard] - A billboard to associate with this entity.
    * @property [box] - A box to associate with this entity.
    * @property [corridor] - A corridor to associate with this entity.
    * @property [cylinder] - A cylinder to associate with this entity.
    * @property [ellipse] - A ellipse to associate with this entity.
    * @property [ellipsoid] - A ellipsoid to associate with this entity.
    * @property [label] - A options.label to associate with this entity.
    * @property [model] - A model to associate with this entity.
    * @property [tileset] - A 3D Tiles tileset to associate with this entity.
    * @property [path] - A path to associate with this entity.
    * @property [plane] - A plane to associate with this entity.
    * @property [point] - A point to associate with this entity.
    * @property [polygon] - A polygon to associate with this entity.
    * @property [polyline] - A polyline to associate with this entity.
    * @property [properties] - Arbitrary properties to associate with this entity.
    * @property [polylineVolume] - A polylineVolume to associate with this entity.
    * @property [rectangle] - A rectangle to associate with this entity.
    * @property [wall] - A wall to associate with this entity.
    */
  trait ConstructorOptions extends StObject {
    
    var availability: js.UndefOr[TimeIntervalCollection] = js.undefined
    
    var billboard: js.UndefOr[
        BillboardGraphics | typings.cesiumEngine.mod.BillboardGraphics.ConstructorOptions
      ] = js.undefined
    
    var box: js.UndefOr[BoxGraphics | typings.cesiumEngine.mod.BoxGraphics.ConstructorOptions] = js.undefined
    
    var corridor: js.UndefOr[CorridorGraphics | typings.cesiumEngine.mod.CorridorGraphics.ConstructorOptions] = js.undefined
    
    var cylinder: js.UndefOr[CylinderGraphics | typings.cesiumEngine.mod.CylinderGraphics.ConstructorOptions] = js.undefined
    
    var description: js.UndefOr[Property | String] = js.undefined
    
    var ellipse: js.UndefOr[EllipseGraphics | typings.cesiumEngine.mod.EllipseGraphics.ConstructorOptions] = js.undefined
    
    var ellipsoid: js.UndefOr[
        EllipsoidGraphics | typings.cesiumEngine.mod.EllipsoidGraphics.ConstructorOptions
      ] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[LabelGraphics | typings.cesiumEngine.mod.LabelGraphics.ConstructorOptions] = js.undefined
    
    var model: js.UndefOr[ModelGraphics | typings.cesiumEngine.mod.ModelGraphics.ConstructorOptions] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var orientation: js.UndefOr[Property] = js.undefined
    
    var parent: js.UndefOr[Entity] = js.undefined
    
    var path: js.UndefOr[PathGraphics | typings.cesiumEngine.mod.PathGraphics.ConstructorOptions] = js.undefined
    
    var plane: js.UndefOr[PlaneGraphics | typings.cesiumEngine.mod.PlaneGraphics.ConstructorOptions] = js.undefined
    
    var point: js.UndefOr[PointGraphics | typings.cesiumEngine.mod.PointGraphics.ConstructorOptions] = js.undefined
    
    var polygon: js.UndefOr[PolygonGraphics | typings.cesiumEngine.mod.PolygonGraphics.ConstructorOptions] = js.undefined
    
    var polyline: js.UndefOr[PolylineGraphics | typings.cesiumEngine.mod.PolylineGraphics.ConstructorOptions] = js.undefined
    
    var polylineVolume: js.UndefOr[
        PolylineVolumeGraphics | typings.cesiumEngine.mod.PolylineVolumeGraphics.ConstructorOptions
      ] = js.undefined
    
    var position: js.UndefOr[PositionProperty | Cartesian3] = js.undefined
    
    var properties: js.UndefOr[PropertyBag | StringDictionary[Any]] = js.undefined
    
    var rectangle: js.UndefOr[
        RectangleGraphics | typings.cesiumEngine.mod.RectangleGraphics.ConstructorOptions
      ] = js.undefined
    
    var show: js.UndefOr[Boolean] = js.undefined
    
    var tileset: js.UndefOr[
        Cesium3DTilesetGraphics | typings.cesiumEngine.mod.Cesium3DTilesetGraphics.ConstructorOptions
      ] = js.undefined
    
    var viewFrom: js.UndefOr[Property] = js.undefined
    
    var wall: js.UndefOr[WallGraphics | typings.cesiumEngine.mod.WallGraphics.ConstructorOptions] = js.undefined
  }
  object ConstructorOptions {
    
    inline def apply(): ConstructorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConstructorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConstructorOptions] (val x: Self) extends AnyVal {
      
      inline def setAvailability(value: TimeIntervalCollection): Self = StObject.set(x, "availability", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityUndefined: Self = StObject.set(x, "availability", js.undefined)
      
      inline def setBillboard(value: BillboardGraphics | typings.cesiumEngine.mod.BillboardGraphics.ConstructorOptions): Self = StObject.set(x, "billboard", value.asInstanceOf[js.Any])
      
      inline def setBillboardUndefined: Self = StObject.set(x, "billboard", js.undefined)
      
      inline def setBox(value: BoxGraphics | typings.cesiumEngine.mod.BoxGraphics.ConstructorOptions): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      inline def setCorridor(value: CorridorGraphics | typings.cesiumEngine.mod.CorridorGraphics.ConstructorOptions): Self = StObject.set(x, "corridor", value.asInstanceOf[js.Any])
      
      inline def setCorridorUndefined: Self = StObject.set(x, "corridor", js.undefined)
      
      inline def setCylinder(value: CylinderGraphics | typings.cesiumEngine.mod.CylinderGraphics.ConstructorOptions): Self = StObject.set(x, "cylinder", value.asInstanceOf[js.Any])
      
      inline def setCylinderUndefined: Self = StObject.set(x, "cylinder", js.undefined)
      
      inline def setDescription(value: Property | String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setEllipse(value: EllipseGraphics | typings.cesiumEngine.mod.EllipseGraphics.ConstructorOptions): Self = StObject.set(x, "ellipse", value.asInstanceOf[js.Any])
      
      inline def setEllipseUndefined: Self = StObject.set(x, "ellipse", js.undefined)
      
      inline def setEllipsoid(value: EllipsoidGraphics | typings.cesiumEngine.mod.EllipsoidGraphics.ConstructorOptions): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
      
      inline def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: LabelGraphics | typings.cesiumEngine.mod.LabelGraphics.ConstructorOptions): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setModel(value: ModelGraphics | typings.cesiumEngine.mod.ModelGraphics.ConstructorOptions): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOrientation(value: Property): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setParent(value: Entity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setPath(value: PathGraphics | typings.cesiumEngine.mod.PathGraphics.ConstructorOptions): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPlane(value: PlaneGraphics | typings.cesiumEngine.mod.PlaneGraphics.ConstructorOptions): Self = StObject.set(x, "plane", value.asInstanceOf[js.Any])
      
      inline def setPlaneUndefined: Self = StObject.set(x, "plane", js.undefined)
      
      inline def setPoint(value: PointGraphics | typings.cesiumEngine.mod.PointGraphics.ConstructorOptions): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setPolygon(value: PolygonGraphics | typings.cesiumEngine.mod.PolygonGraphics.ConstructorOptions): Self = StObject.set(x, "polygon", value.asInstanceOf[js.Any])
      
      inline def setPolygonUndefined: Self = StObject.set(x, "polygon", js.undefined)
      
      inline def setPolyline(value: PolylineGraphics | typings.cesiumEngine.mod.PolylineGraphics.ConstructorOptions): Self = StObject.set(x, "polyline", value.asInstanceOf[js.Any])
      
      inline def setPolylineUndefined: Self = StObject.set(x, "polyline", js.undefined)
      
      inline def setPolylineVolume(value: PolylineVolumeGraphics | typings.cesiumEngine.mod.PolylineVolumeGraphics.ConstructorOptions): Self = StObject.set(x, "polylineVolume", value.asInstanceOf[js.Any])
      
      inline def setPolylineVolumeUndefined: Self = StObject.set(x, "polylineVolume", js.undefined)
      
      inline def setPosition(value: PositionProperty | Cartesian3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setProperties(value: PropertyBag | StringDictionary[Any]): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setRectangle(value: RectangleGraphics | typings.cesiumEngine.mod.RectangleGraphics.ConstructorOptions): Self = StObject.set(x, "rectangle", value.asInstanceOf[js.Any])
      
      inline def setRectangleUndefined: Self = StObject.set(x, "rectangle", js.undefined)
      
      inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
      
      inline def setTileset(
        value: Cesium3DTilesetGraphics | typings.cesiumEngine.mod.Cesium3DTilesetGraphics.ConstructorOptions
      ): Self = StObject.set(x, "tileset", value.asInstanceOf[js.Any])
      
      inline def setTilesetUndefined: Self = StObject.set(x, "tileset", js.undefined)
      
      inline def setViewFrom(value: Property): Self = StObject.set(x, "viewFrom", value.asInstanceOf[js.Any])
      
      inline def setViewFromUndefined: Self = StObject.set(x, "viewFrom", js.undefined)
      
      inline def setWall(value: WallGraphics | typings.cesiumEngine.mod.WallGraphics.ConstructorOptions): Self = StObject.set(x, "wall", value.asInstanceOf[js.Any])
      
      inline def setWallUndefined: Self = StObject.set(x, "wall", js.undefined)
    }
  }
}
